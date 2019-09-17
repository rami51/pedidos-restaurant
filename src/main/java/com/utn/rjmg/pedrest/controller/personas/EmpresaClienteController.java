package com.utn.rjmg.pedrest.controller.personas;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.utn.rjmg.pedrest.controller.base.AbstractBaseRestController;
import com.utn.rjmg.pedrest.model.personas.EmpresaCliente;
import com.utn.rjmg.pedrest.service.personas.EmpresaClienteService;
import com.utn.rjmg.pedrest.specification.personas.EmpresaClienteSpecification;

@RestController
@RequestMapping("/empresasclientes")
public class EmpresaClienteController extends AbstractBaseRestController<EmpresaCliente, EmpresaClienteService, EmpresaClienteSpecification> {
	
}
