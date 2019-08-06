package com.utn.rjmg.pedrest.repository.factura;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.utn.rjmg.pedrest.model.factura.Factura;

@Repository
public interface FacturaRepository extends JpaRepository<Factura, Long>{
	
}
