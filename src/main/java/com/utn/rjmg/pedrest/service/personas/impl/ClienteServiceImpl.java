package com.utn.rjmg.pedrest.service.personas.impl;

import org.springframework.stereotype.Service;

import com.utn.rjmg.pedrest.model.personas.Cliente;
import com.utn.rjmg.pedrest.repository.personas.ClienteRepository;
import com.utn.rjmg.pedrest.service.base.AbstractBaseCrudService;
import com.utn.rjmg.pedrest.service.personas.ClienteService;

@Service
public class ClienteServiceImpl 
	extends AbstractBaseCrudService<Cliente, ClienteRepository> 
	implements ClienteService {
	
}
