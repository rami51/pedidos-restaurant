package com.utn.rjmg.pedrest.controller.usuario;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.utn.rjmg.pedrest.controller.base.AbstractBaseRestController;
import com.utn.rjmg.pedrest.model.usuario.Permiso;
import com.utn.rjmg.pedrest.service.usuario.PermisoService;

@RestController
@RequestMapping("/permisos")
public class PermisoController  extends AbstractBaseRestController<Permiso, PermisoService>  {
	
}
