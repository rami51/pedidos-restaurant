package com.utn.rjmg.pedrest.model.personas;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import com.utn.rjmg.pedrest.model.AbstractPersistentObject;
import com.utn.rjmg.pedrest.model.usuario.Usuario;;
@Entity
public class Empleado extends AbstractPersistentObject {
	
	@OneToOne
	private Usuario usuario;

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
}
