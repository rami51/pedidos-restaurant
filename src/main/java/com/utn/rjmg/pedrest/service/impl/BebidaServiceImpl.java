package com.utn.rjmg.pedrest.service.impl;

import org.springframework.stereotype.Service;

import com.utn.rjmg.pedrest.model.comida.Bebida;
import com.utn.rjmg.pedrest.repository.BebidaRepository;
import com.utn.rjmg.pedrest.service.BebidaService;
import com.utn.rjmg.pedrest.service.base.AbstractBaseCrudService;

@Service
public class BebidaServiceImpl 
	extends AbstractBaseCrudService<Bebida, BebidaRepository> 
	implements BebidaService {
	
}
