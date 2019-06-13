package com.utn.rjmg.pedrest.model.pedido;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
//import javax.persistence.PrimaryKeyJoinColumn;

import com.utn.rjmg.pedrest.model.AbstractPersistentObject;
import com.utn.rjmg.pedrest.model.comida.ItemComidaPedido;
import com.utn.rjmg.pedrest.model.factura.Factura;
import com.utn.rjmg.pedrest.model.personas.Cliente;
@Entity
public class Pedido extends AbstractPersistentObject {
	
		@OneToMany(mappedBy = "pedido", fetch = FetchType.LAZY)	  
	private List<ItemComidaPedido> itemComidaPedidoList;

	 	@OneToOne
	 //@PrimaryKeyJoinColumn
	 private Cliente cliente;
	 	 @OneToOne
	 //@PrimaryKeyJoinColumn
	 private Horario horario;
	 	 @OneToOne
	 //@PrimaryKeyJoinColumn
	 private Factura factura;
	 
	 
	 
	 
}
