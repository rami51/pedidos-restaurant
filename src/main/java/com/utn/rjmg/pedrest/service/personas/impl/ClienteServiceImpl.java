package com.utn.rjmg.pedrest.service.personas.impl;

import org.springframework.stereotype.Service;

import com.utn.rjmg.pedrest.model.personas.Cliente;
import com.utn.rjmg.pedrest.repository.personas.ClienteRepository;
import com.utn.rjmg.pedrest.service.base.AbstractBaseService;
import com.utn.rjmg.pedrest.service.personas.ClienteService;

@Service
public class ClienteServiceImpl 
	extends AbstractBaseService<Cliente, ClienteRepository> 
	implements ClienteService {
	
}
