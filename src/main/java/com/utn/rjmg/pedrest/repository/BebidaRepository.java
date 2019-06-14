package com.utn.rjmg.pedrest.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.utn.rjmg.pedrest.model.comida.Bebida;

@Repository
public interface BebidaRepository extends CrudRepository<Bebida, Long>{
	
}
