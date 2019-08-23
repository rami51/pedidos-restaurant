package com.utn.rjmg.pedrest.service.comida.impl;

import org.springframework.stereotype.Service;

import com.utn.rjmg.pedrest.model.comida.Postre;
import com.utn.rjmg.pedrest.repository.comida.PostreRepository;
import com.utn.rjmg.pedrest.service.base.AbstractBaseService;
import com.utn.rjmg.pedrest.service.comida.PostreService;

@Service
public class PostreServiceImpl 
	extends AbstractBaseService<Postre, PostreRepository> 
	implements PostreService {
	
}
