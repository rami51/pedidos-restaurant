package com.utn.rjmg.pedrest.model.comida;

import java.util.List;

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
	

}
