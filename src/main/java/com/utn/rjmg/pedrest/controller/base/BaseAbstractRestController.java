package com.utn.rjmg.pedrest.controller.base;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang3.tuple.Pair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;

import com.utn.rjmg.pedrest.model.AbstractPersistentObject;
import com.utn.rjmg.pedrest.service.base.BaseCrudService;
import com.utn.rjmg.pedrest.util.EntityUtil;

public abstract class BaseAbstractRestController<T extends AbstractPersistentObject, ID, S extends BaseCrudService<T,ID>, SP> {
	//T is the Entity class
	//ID is the type of the id Entity's
	//S is the Service class
	//T is the spec?
	
	@Autowired
	private S service;

	// Aggregate root

	@GetMapping()
	Iterable<T> all() {
		return service.findAll();
	}
	
	@PostMapping()
	T newEntity(@RequestBody T entity) {
		service.save(entity);
		return entity;
	}
	
	// Single item
	
	@GetMapping("/{id}")
	T one(@PathVariable ID id) {
		return service.findById(id)
				.orElseThrow(() -> new HttpClientErrorException(HttpStatus.NOT_FOUND));
	}
	
	@PutMapping("/{id}")
	T replaceEntity(@RequestBody T entity, @PathVariable ID id) {
		T savedEntity = this.one(id);
		final List<Method> allMethods = Arrays.asList(savedEntity.getClass().getMethods());
		List<Pair<Method, Method>> getterAndSetterList = 
			  EntityUtil.getNonTransientGetterAndSetterPairs(savedEntity.getClass());
		getterAndSetterList.forEach(pair -> {
			Method getter = allMethods.get(allMethods.indexOf(pair.getLeft()));
			Method setter = allMethods.get(allMethods.indexOf(pair.getRight()));
			try {
				setter.invoke(savedEntity, getter.invoke(entity, null));
			} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
				throw new HttpServerErrorException(HttpStatus.CONFLICT, 
						"Error on entity: " + savedEntity.getClass().getSimpleName() +
						", please see getter '" + getter.getName() + "' and setter '" +
						setter.getName() + "'");
			}
		});
		service.save(savedEntity);
		return savedEntity;
	}
	
	@DeleteMapping("/{id}")
	void deleteEmployee(@PathVariable ID id) {
	  service.delete(this.one(id));
	}
}
