package com.utn.rjmg.pedrest.service.base;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;

import com.utn.rjmg.pedrest.model.AbstractPersistentObject;
import com.utn.rjmg.pedrest.repository.base.BaseRepository;

public abstract class AbstractBaseService<T extends AbstractPersistentObject, R extends BaseRepository<T>> implements BaseService<T> {
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
	public Optional<T> findOne(Specification<T> spec) {
		return repository.findOne(spec);
	}

	@Override
	public List<T> findAll(Specification<T> spec) {
		return repository.findAll(spec);
	}

	@Override
	public Page<T> findAll(Specification<T> spec, Pageable pageable) {
		return repository.findAll(spec, pageable);
	}

	@Override
	public void delete(T entity) {
		repository.delete(entity);
	}
	
}
