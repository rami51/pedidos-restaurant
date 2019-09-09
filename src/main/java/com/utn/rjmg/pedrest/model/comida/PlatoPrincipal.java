package com.utn.rjmg.pedrest.model.comida;

import javax.persistence.Entity;

@Entity
public class PlatoPrincipal extends ItemComida {
	
	private Boolean horno;
	private Boolean salsa;
	private Boolean guarnicion;

	public Boolean getHorno() {
		return horno;
	}

	public void setHorno(Boolean horno) {
		this.horno = horno;
	}

	public Boolean getSalsa() {
		return salsa;
	}

	public void setSalsa(Boolean salsa) {
		this.salsa = salsa;
	}

	public Boolean getGuarnicion() {
		return guarnicion;
	}

	public void setGuarnicion(Boolean guarnicion) {
		this.guarnicion = guarnicion;
	}
	
}
