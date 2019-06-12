package com.utn.rjmg.pedrest.model.factura;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.utn.rjmg.pedrest.model.AbstractPersistentObject;
import com.utn.rjmg.pedrest.model.comida.ItemComidaPedido;
import com.utn.rjmg.pedrest.model.pedido.Pedido;
import com.utn.rjmg.pedrest.model.personas.EmpresaCliente;
import com.utn.rjmg.pedrest.model.personas.EmpresaRestaurant;
@Entity
public class Factura extends AbstractPersistentObject {
	
	@OneToMany(mappedBy = "factura", fetch = FetchType.LAZY)	  
	private List<Pedido> pedidoList;
	
	@OneToOne
	private EmpresaCliente empresaCliente;
	@OneToOne
	private EmpresaRestaurant empresaRestaurant;


}
