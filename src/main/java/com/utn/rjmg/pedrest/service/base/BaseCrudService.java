package com.utn.rjmg.pedrest.service.base;

import java.util.Optional;

public interface BaseCrudService<T, ID> {
	<S extends T> void save(S entity);
	<S extends T> Iterable<S> saveAll(Iterable<S> entities);
	Optional<T> findById(ID id);
	Iterable<T> findAll();
	void delete(T entity);	
}
