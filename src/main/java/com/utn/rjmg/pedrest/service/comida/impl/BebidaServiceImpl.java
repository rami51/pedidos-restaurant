package com.utn.rjmg.pedrest.service.comida.impl;

import org.springframework.stereotype.Service;

import com.utn.rjmg.pedrest.model.comida.Bebida;
import com.utn.rjmg.pedrest.repository.comida.BebidaRepository;
import com.utn.rjmg.pedrest.service.base.AbstractBaseService;
import com.utn.rjmg.pedrest.service.comida.BebidaService;

@Service
public class BebidaServiceImpl 
	extends AbstractBaseService<Bebida, BebidaRepository> 
	implements BebidaService {
	
}
