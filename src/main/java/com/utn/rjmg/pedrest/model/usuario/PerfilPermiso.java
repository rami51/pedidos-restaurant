package com.utn.rjmg.pedrest.model.usuario;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import com.utn.rjmg.pedrest.model.AbstractPersistentObject;

@Entity
public class PerfilPermiso extends AbstractPersistentObject {
	
	@ManyToOne	  
	private Permisos permisos;
	@ManyToOne	  
	private Perfil perfil;

}
