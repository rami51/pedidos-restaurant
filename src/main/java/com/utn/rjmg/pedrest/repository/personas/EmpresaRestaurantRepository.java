package com.utn.rjmg.pedrest.repository.personas;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.utn.rjmg.pedrest.model.personas.EmpresaRestaurant;

@Repository
public interface EmpresaRestaurantRepository extends JpaRepository<EmpresaRestaurant, Long>{
	
}
