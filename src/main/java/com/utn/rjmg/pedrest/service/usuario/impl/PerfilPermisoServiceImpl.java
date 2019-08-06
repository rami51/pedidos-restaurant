package com.utn.rjmg.pedrest.service.usuario.impl;

import org.springframework.stereotype.Service;

import com.utn.rjmg.pedrest.model.usuario.PerfilPermiso;
import com.utn.rjmg.pedrest.repository.usuario.PerfilPermisoRepository;
import com.utn.rjmg.pedrest.service.base.AbstractBaseCrudService;
import com.utn.rjmg.pedrest.service.usuario.PerfilPermisoService;

@Service
public class PerfilPermisoServiceImpl
extends AbstractBaseCrudService<PerfilPermiso, PerfilPermisoRepository> 
implements PerfilPermisoService {

}
