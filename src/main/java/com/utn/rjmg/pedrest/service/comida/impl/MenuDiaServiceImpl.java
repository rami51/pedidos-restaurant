package com.utn.rjmg.pedrest.service.comida.impl;

import org.springframework.stereotype.Service;

import com.utn.rjmg.pedrest.model.comida.MenuDia;
import com.utn.rjmg.pedrest.repository.comida.MenuDiaRepository;
import com.utn.rjmg.pedrest.service.base.AbstractBaseCrudService;
import com.utn.rjmg.pedrest.service.comida.MenuDiaService;

@Service
public class MenuDiaServiceImpl 
	extends AbstractBaseCrudService<MenuDia, MenuDiaRepository> 
	implements MenuDiaService {
	
}
