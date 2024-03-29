package com.utn.rjmg.pedrest.model.usuario;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import com.utn.rjmg.pedrest.model.AbstractPersistentObject;

@Entity
public class PerfilPermiso extends AbstractPersistentObject {
	
	@ManyToOne	  
	private Permiso permiso;
	@ManyToOne	  
	private Perfil perfil;
	public Permiso getPermiso() {
		return permiso;
	}
	public void setPermiso(Permiso permiso) {
		this.permiso = permiso;
	}
	public Perfil getPerfil() {
		return perfil;
	}
	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}

}
