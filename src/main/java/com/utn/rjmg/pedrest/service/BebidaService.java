package com.utn.rjmg.pedrest.service;

import org.springframework.stereotype.Service;

import com.utn.rjmg.pedrest.model.comida.Bebida;
import com.utn.rjmg.pedrest.service.base.BaseCrudService;

@Service
public interface BebidaService extends BaseCrudService<Bebida, Long> {
	
}
