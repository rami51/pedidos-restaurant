package com.utn.rjmg.pedrest.controller.comida;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.utn.rjmg.pedrest.controller.base.AbstractBaseRestController;
import com.utn.rjmg.pedrest.model.comida.Salsa;
import com.utn.rjmg.pedrest.service.comida.SalsaService;
import com.utn.rjmg.pedrest.specification.comida.SalsaSpecification;

@RestController
@RequestMapping("/salsas")
public class SalsaController extends AbstractBaseRestController<Salsa, SalsaService, SalsaSpecification> {
	
}
