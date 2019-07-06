package com.utn.rjmg.pedrest.service.comida.impl;

import org.springframework.stereotype.Service;

import com.utn.rjmg.pedrest.model.comida.Bebida;
import com.utn.rjmg.pedrest.repository.comida.BebidaRepository;
import com.utn.rjmg.pedrest.service.base.AbstractBaseCrudService;
import com.utn.rjmg.pedrest.service.comida.BebidaService;

@Service
public class BebidaServiceImpl 
	extends AbstractBaseCrudService<Bebida, BebidaRepository> 
	implements BebidaService {
	
}
