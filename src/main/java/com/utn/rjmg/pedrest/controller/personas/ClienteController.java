package com.utn.rjmg.pedrest.controller.personas;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.utn.rjmg.pedrest.controller.base.AbstractBaseRestController;
import com.utn.rjmg.pedrest.model.personas.Cliente;
import com.utn.rjmg.pedrest.service.personas.ClienteService;
import com.utn.rjmg.pedrest.specification.personas.ClienteSpecification;

@RestController
@RequestMapping("/clientes")
public class ClienteController extends AbstractBaseRestController<Cliente, ClienteService, ClienteSpecification> {
	
}
