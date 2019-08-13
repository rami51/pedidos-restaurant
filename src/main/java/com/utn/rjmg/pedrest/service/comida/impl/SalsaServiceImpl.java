package com.utn.rjmg.pedrest.service.comida.impl;

import org.springframework.stereotype.Service;

import com.utn.rjmg.pedrest.model.comida.Salsa;
import com.utn.rjmg.pedrest.repository.comida.SalsaRepository;
import com.utn.rjmg.pedrest.service.base.AbstractBaseCrudService;
import com.utn.rjmg.pedrest.service.comida.SalsaService;

@Service
public class SalsaServiceImpl 
	extends AbstractBaseCrudService<Salsa, SalsaRepository> 
	implements SalsaService {
	
}
