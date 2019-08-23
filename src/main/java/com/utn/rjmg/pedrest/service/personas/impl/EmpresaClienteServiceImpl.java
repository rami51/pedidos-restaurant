package com.utn.rjmg.pedrest.service.personas.impl;

import org.springframework.stereotype.Service;

import com.utn.rjmg.pedrest.model.personas.EmpresaCliente;
import com.utn.rjmg.pedrest.repository.personas.EmpresaClienteRepository;
import com.utn.rjmg.pedrest.service.base.AbstractBaseService;
import com.utn.rjmg.pedrest.service.personas.EmpresaClienteService;

@Service
public class EmpresaClienteServiceImpl 
	extends AbstractBaseService<EmpresaCliente, EmpresaClienteRepository> 
	implements EmpresaClienteService {
	
}
