package com.utn.rjmg.pedrest.service.comida.impl;

import org.springframework.stereotype.Service;

import com.utn.rjmg.pedrest.model.comida.MenuDia;
import com.utn.rjmg.pedrest.repository.comida.MenuDiaRepository;
import com.utn.rjmg.pedrest.service.base.AbstractBaseService;
import com.utn.rjmg.pedrest.service.comida.MenuDiaService;

@Service
public class MenuDiaServiceImpl 
	extends AbstractBaseService<MenuDia, MenuDiaRepository> 
	implements MenuDiaService {
	
}
