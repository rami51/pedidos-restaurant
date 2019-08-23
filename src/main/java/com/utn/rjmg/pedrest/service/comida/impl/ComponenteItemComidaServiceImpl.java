package com.utn.rjmg.pedrest.service.comida.impl;

import org.springframework.stereotype.Service;

import com.utn.rjmg.pedrest.model.comida.ComponenteItemComida;
import com.utn.rjmg.pedrest.repository.comida.ComponenteItemComidaRepository;
import com.utn.rjmg.pedrest.service.base.AbstractBaseService;
import com.utn.rjmg.pedrest.service.comida.ComponenteItemComidaService;

@Service
public class ComponenteItemComidaServiceImpl 
	extends AbstractBaseService<ComponenteItemComida, ComponenteItemComidaRepository> 
	implements ComponenteItemComidaService {
	
}
