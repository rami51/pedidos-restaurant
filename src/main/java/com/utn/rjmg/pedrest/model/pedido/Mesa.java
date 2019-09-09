package com.utn.rjmg.pedrest.model.pedido;

import java.time.LocalTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import com.utn.rjmg.pedrest.model.AbstractPersistentObject;
@Entity
public class Mesa extends AbstractPersistentObject {
	
	@OneToMany(mappedBy = "mesa", fetch = FetchType.LAZY)	  
	private List<Pedido> pedidoList;
	
	private String mesa;

	public String getMesa() {
		return mesa;
	}

	public void setMesa(String mesa) {
		this.mesa = mesa;
	}
}
