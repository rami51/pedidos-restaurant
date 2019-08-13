package com.utn.rjmg.pedrest.repository.comida;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.utn.rjmg.pedrest.model.comida.Bebida;
import com.utn.rjmg.pedrest.model.comida.Postre;

@Repository
public interface PostreRepository extends JpaRepository<Postre, Long>{
	
}