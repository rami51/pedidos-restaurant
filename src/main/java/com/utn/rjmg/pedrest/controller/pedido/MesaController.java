package com.utn.rjmg.pedrest.controller.pedido;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.utn.rjmg.pedrest.controller.base.AbstractBaseRestController;
import com.utn.rjmg.pedrest.model.pedido.Mesa;
import com.utn.rjmg.pedrest.service.pedido.MesaService;
import com.utn.rjmg.pedrest.specification.pedido.MesaSpecification;

@RestController
@RequestMapping("/bebidas")
public class MesaController extends AbstractBaseRestController<Mesa, MesaService, MesaSpecification> {
	
}
