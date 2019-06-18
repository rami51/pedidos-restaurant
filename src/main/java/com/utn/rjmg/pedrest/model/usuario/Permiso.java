package com.utn.rjmg.pedrest.model.usuario;

import javax.persistence.Entity;

import com.utn.rjmg.pedrest.model.AbstractPersistentObject;
@Entity
public class Permiso extends AbstractPersistentObject {
	private String codigo;

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
}
