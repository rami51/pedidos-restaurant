package com.utn.rjmg.pedrest.controller.comida;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.utn.rjmg.pedrest.controller.base.AbstractBaseRestController;
import com.utn.rjmg.pedrest.model.comida.ComponenteItemComida;
import com.utn.rjmg.pedrest.service.comida.ComponenteItemComidaService;
import com.utn.rjmg.pedrest.specification.comida.ComponenteItemComidaSpecification;

@RestController
@RequestMapping("/adicionales") /*componenteItemComida*/
public class ComponenteItemComidaController extends AbstractBaseRestController<ComponenteItemComida, ComponenteItemComidaService, ComponenteItemComidaSpecification> {
	
}
