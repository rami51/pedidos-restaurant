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
	public List<Pedido> getPedidoList() {
		return pedidoList;
	}
	public void setPedidoList(List<Pedido> pedidoList) {
		this.pedidoList = pedidoList;
	}
	public EmpresaCliente getEmpresaCliente() {
		return empresaCliente;
	}
	public void setEmpresaCliente(EmpresaCliente empresaCliente) {
		this.empresaCliente = empresaCliente;
	}
	public EmpresaRestaurant getEmpresaRestaurant() {
		return empresaRestaurant;
	}
	public void setEmpresaRestaurant(EmpresaRestaurant empresaRestaurant) {
		this.empresaRestaurant = empresaRestaurant;
	}
}
