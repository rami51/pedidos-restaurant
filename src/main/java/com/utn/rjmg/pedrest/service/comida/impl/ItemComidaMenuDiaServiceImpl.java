package com.utn.rjmg.pedrest.service.comida.impl;

import org.springframework.stereotype.Service;

import com.utn.rjmg.pedrest.model.comida.ItemComidaMenuDia;
import com.utn.rjmg.pedrest.repository.comida.ItemComidaMenuDiaRepository;
import com.utn.rjmg.pedrest.service.base.AbstractBaseCrudService;
import com.utn.rjmg.pedrest.service.comida.ItemComidaMenuDiaService;

@Service
public class ItemComidaMenuDiaServiceImpl 
	extends AbstractBaseCrudService<ItemComidaMenuDia, ItemComidaMenuDiaRepository> 
	implements ItemComidaMenuDiaService {
	
}
