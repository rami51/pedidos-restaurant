package com.utn.rjmg.pedrest.service.usuario.impl;

import org.springframework.stereotype.Service;

import com.utn.rjmg.pedrest.model.comida.Bebida;
import com.utn.rjmg.pedrest.model.usuario.Permiso;
import com.utn.rjmg.pedrest.repository.comida.BebidaRepository;
import com.utn.rjmg.pedrest.repository.permiso.PermisoRepository;
import com.utn.rjmg.pedrest.service.base.AbstractBaseCrudService;
import com.utn.rjmg.pedrest.service.comida.BebidaService;
import com.utn.rjmg.pedrest.service.usuario.PermisoService;

@Service
public class PermisoServiceImpl 
	extends AbstractBaseCrudService<Permiso, PermisoRepository> 
	implements PermisoService {
	
}
