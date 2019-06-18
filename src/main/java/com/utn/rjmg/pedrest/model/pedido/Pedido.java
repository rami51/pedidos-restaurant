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
	public List<ItemComidaPedido> getItemComidaPedidoList() {
		return itemComidaPedidoList;
	}
	public void setItemComidaPedidoList(List<ItemComidaPedido> itemComidaPedidoList) {
		this.itemComidaPedidoList = itemComidaPedidoList;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Horario getHorario() {
		return horario;
	}
	public void setHorario(Horario horario) {
		this.horario = horario;
	}
	public Factura getFactura() {
		return factura;
	}
	public void setFactura(Factura factura) {
		this.factura = factura;
	}
}
