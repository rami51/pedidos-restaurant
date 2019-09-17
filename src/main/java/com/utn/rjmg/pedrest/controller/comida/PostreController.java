package com.utn.rjmg.pedrest.controller.comida;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.utn.rjmg.pedrest.controller.base.AbstractBaseRestController;
import com.utn.rjmg.pedrest.model.comida.Postre;
import com.utn.rjmg.pedrest.service.comida.PostreService;
import com.utn.rjmg.pedrest.specification.comida.PostreSpecification;

@RestController
@RequestMapping("/postres")
public class PostreController extends AbstractBaseRestController<Postre, PostreService, PostreSpecification> {
	
}
