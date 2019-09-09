package com.utn.rjmg.pedrest.model.pedido;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.utn.rjmg.pedrest.model.AbstractPersistentObject;
import com.utn.rjmg.pedrest.model.comida.ItemComidaPedido;
import com.utn.rjmg.pedrest.model.factura.Factura;
import com.utn.rjmg.pedrest.model.personas.Cliente;
@Entity
public class Pedido extends AbstractPersistentObject {
	@OneToMany(mappedBy = "pedido", fetch = FetchType.LAZY)	  
	private List<ItemComidaPedido> itemComidaPedidoList;

 	@ManyToOne
	private Cliente cliente;
 	@ManyToOne
	private Horario horario;
 	@ManyToOne
	private Factura factura;
 	@ManyToOne
 	private Mesa mesa;
 	
 	private EstadoPedido estado;
 	
 	private String identificador;
	
	public EstadoPedido getEstado() {
		return estado;
	}
	public void setEstado(EstadoPedido estado) {
		this.estado = estado;
	}
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
	public Mesa getMesa() {
		return mesa;
	}
	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
	}
	public String getIdentificador() {
		return identificador;
	}
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
}
