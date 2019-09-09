package com.utn.rjmg.pedrest.model.pedido;

import javax.persistence.Entity;

import com.utn.rjmg.pedrest.model.AbstractPersistentObject;
@Entity
public class Horario extends AbstractPersistentObject {
	
	private String horario;

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}
}
