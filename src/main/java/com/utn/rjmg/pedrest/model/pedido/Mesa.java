package com.utn.rjmg.pedrest.model.pedido;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import com.utn.rjmg.pedrest.model.AbstractPersistentObject;
@Entity
public class Mesa extends AbstractPersistentObject {
	
	@OneToMany(mappedBy = "mesa", fetch = FetchType.LAZY)	  
	private List<Pedido> pedidoList;
	
	private String nombre;

	public List<Pedido> getPedidoList() {
		return pedidoList;
	}

	public void setPedidoList(List<Pedido> pedidoList) {
		this.pedidoList = pedidoList;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
