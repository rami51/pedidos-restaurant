package com.utn.rjmg.pedrest.service.comida.impl;

import org.springframework.stereotype.Service;

import com.utn.rjmg.pedrest.model.comida.ItemComida;
import com.utn.rjmg.pedrest.repository.comida.ItemComidaRepository;
import com.utn.rjmg.pedrest.service.base.AbstractBaseService;
import com.utn.rjmg.pedrest.service.comida.ItemComidaService;

@Service
public class ItemComidaServiceImpl 
	extends AbstractBaseService<ItemComida, ItemComidaRepository> 
	implements ItemComidaService {
	
}
