package com.utn.rjmg.pedrest.service.base;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

public abstract class AbstractBaseCrudService<T, R extends CrudRepository<T, Long>> implements BaseCrudService<T> {
	@Autowired
	R repository;
	
	@Override
	public <S extends T> void save(S entity) {
		repository.save(entity);
	}

	@Override
	public <S extends T> Iterable<S> saveAll(Iterable<S> entities) {
		return repository.saveAll(entities);
	}

	@Override
	public Optional<T> findById(Long id) {
		return repository.findById(id);
	}

	@Override
	public Iterable<T> findAll() {
		return repository.findAll();
	}

	@Override
	public void delete(T entity) {
		repository.delete(entity);
	}
	
}
