package com.utn.rjmg.pedrest.controller.base;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.HttpClientErrorException;

import com.utn.rjmg.pedrest.model.AbstractPersistentObject;
import com.utn.rjmg.pedrest.service.base.BaseService;
import com.utn.rjmg.pedrest.specification.base.AbstractBaseSpecification;

public abstract class AbstractBaseRestController<T extends AbstractPersistentObject, S extends BaseService<T>, F extends AbstractBaseSpecification<T>> {
	//T is the Entity class
	//ID is the type of the id Entity's
	//S is the Service class
	//F is the Specification
	
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
	T one(@PathVariable Long id) {
		return service.findById(id)
				.orElseThrow(() -> new HttpClientErrorException(HttpStatus.NOT_FOUND));
	}
	
	@GetMapping("/search")
	List<T> search(@RequestBody F spec) {
		return service.findAll(spec);
	}
	
	@GetMapping("/searchOne")
	T searchOne(@RequestBody F spec) {
		return service.findOne(spec).get();
	}
	
	@GetMapping("/searchPaging")
	Page<T> searchPaging(@RequestBody F spec, @RequestBody Pageable pageable) {
		return service.findAll(spec, pageable);
	}
	
	@PutMapping("/{id}")
	T replaceEntity(@RequestBody T entity, @PathVariable Long id) {
		this.one(id);
		entity.setId(id);
		service.save(entity);
		return entity;
	}
	
	@DeleteMapping("/{id}")
	void deleteEmployee(@PathVariable Long id) {
	  service.delete(this.one(id));
	}
}
