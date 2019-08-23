package com.utn.rjmg.pedrest.repository.base;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.utn.rjmg.pedrest.model.AbstractPersistentObject;

public interface BaseRepository<T extends AbstractPersistentObject> extends JpaRepository<T, Long>, JpaSpecificationExecutor<T> {

}
