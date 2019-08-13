package com.utn.rjmg.pedrest.service.personas.impl;

import org.springframework.stereotype.Service;

import com.utn.rjmg.pedrest.model.personas.Empleado;
import com.utn.rjmg.pedrest.repository.personas.EmpleadoRepository;
import com.utn.rjmg.pedrest.service.base.AbstractBaseCrudService;
import com.utn.rjmg.pedrest.service.personas.EmpleadoService;

@Service
public class EmpleadoServiceImpl 
	extends AbstractBaseCrudService<Empleado, EmpleadoRepository> 
	implements EmpleadoService {
	
}
