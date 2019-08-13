package com.utn.rjmg.pedrest.service.personas.impl;

import org.springframework.stereotype.Service;

import com.utn.rjmg.pedrest.model.personas.EmpresaRestaurant;
import com.utn.rjmg.pedrest.repository.personas.EmpresaRestaurantRepository;
import com.utn.rjmg.pedrest.service.base.AbstractBaseCrudService;
import com.utn.rjmg.pedrest.service.personas.EmpresaRestaurantService;

@Service
public class EmpresaRestaurantServiceImpl 
	extends AbstractBaseCrudService<EmpresaRestaurant, EmpresaRestaurantRepository> 
	implements EmpresaRestaurantService {
	
}
