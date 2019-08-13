package com.utn.rjmg.pedrest.service.comida.impl;

import org.springframework.stereotype.Service;

import com.utn.rjmg.pedrest.model.comida.PlatoPrincipal;
import com.utn.rjmg.pedrest.repository.comida.PlatoPrincipalRepository;
import com.utn.rjmg.pedrest.service.base.AbstractBaseCrudService;
import com.utn.rjmg.pedrest.service.comida.PlatoPrincipalService;

@Service
public class PlatoPrincipalServiceImpl 
	extends AbstractBaseCrudService<PlatoPrincipal, PlatoPrincipalRepository> 
	implements PlatoPrincipalService {
	
}
