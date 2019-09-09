package com.utn.rjmg.pedrest.model.comida;

import javax.persistence.Entity;

@Entity
public class Bebida extends ItemComida {
	private Boolean light;

	public Boolean getLight() {
		return light;
	}

	public void setLight(Boolean light) {
		this.light = light;
	}
	
}
