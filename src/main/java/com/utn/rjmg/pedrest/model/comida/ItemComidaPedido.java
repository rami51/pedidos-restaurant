package com.utn.rjmg.pedrest.model.comida;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import com.utn.rjmg.pedrest.model.AbstractPersistentObject;
import com.utn.rjmg.pedrest.model.pedido.Pedido;
@Entity
public class ItemComidaPedido extends AbstractPersistentObject{
	
	@ManyToOne	  
	private ItemComida itemComida;
	
	@ManyToOne	  
	private Pedido pedido;

	public ItemComida getItemComida() {
		return itemComida;
	}

	public void setItemComida(ItemComida itemComida) {
		this.itemComida = itemComida;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
}
