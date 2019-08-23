package com.utn.rjmg.pedrest.service.usuario.impl;

import org.springframework.stereotype.Service;

import com.utn.rjmg.pedrest.model.usuario.Permiso;
import com.utn.rjmg.pedrest.repository.usuario.PermisoRepository;
import com.utn.rjmg.pedrest.service.base.AbstractBaseService;
import com.utn.rjmg.pedrest.service.usuario.PermisoService;

@Service
public class PermisoServiceImpl 
	extends AbstractBaseService<Permiso, PermisoRepository> 
	implements PermisoService {
	
}
