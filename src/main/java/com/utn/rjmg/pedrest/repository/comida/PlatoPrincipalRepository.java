package com.utn.rjmg.pedrest.repository.comida;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.utn.rjmg.pedrest.model.comida.PlatoPrincipal;

@Repository
public interface PlatoPrincipalRepository extends JpaRepository<PlatoPrincipal, Long>{
	
}
