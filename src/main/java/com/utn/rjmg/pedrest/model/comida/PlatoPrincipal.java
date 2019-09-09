package com.utn.rjmg.pedrest.model.comida;

import javax.persistence.Entity;

@Entity
public class PlatoPrincipal extends ItemComida {
	
	/*no encontré donde se especificaba si el menu podía ser al horno*/
	private Boolean horno;

	public Boolean getHorno() {
		return horno;
	}

	public void setHorno(Boolean horno) {
		this.horno = horno;
	}

}
