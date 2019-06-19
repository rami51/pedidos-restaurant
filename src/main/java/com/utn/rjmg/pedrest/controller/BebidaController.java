package com.utn.rjmg.pedrest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.utn.rjmg.pedrest.controller.base.AbstractBaseRestController;
import com.utn.rjmg.pedrest.model.comida.Bebida;
import com.utn.rjmg.pedrest.service.BebidaService;

@RestController
@RequestMapping("/bebidas")
public class BebidaController extends AbstractBaseRestController<Bebida, BebidaService> {
	
}
