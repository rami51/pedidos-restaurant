package com.utn.rjmg.pedrest.controller.comida;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.utn.rjmg.pedrest.controller.base.AbstractBaseRestController;
import com.utn.rjmg.pedrest.model.comida.Bebida;
import com.utn.rjmg.pedrest.service.comida.BebidaService;
import com.utn.rjmg.pedrest.specification.comida.BebidaSpecification;

@RestController
@RequestMapping("/platosprincipales")
public class PlatoPrincipalController extends AbstractBaseRestController<Bebida, BebidaService, BebidaSpecification> {
	
}
