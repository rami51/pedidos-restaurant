package com.utn.rjmg.pedrest.repository.comida;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.utn.rjmg.pedrest.model.comida.Guarnicion;

@Repository
public interface GuarnicionRepository extends JpaRepository<Guarnicion, Long>{
	
}