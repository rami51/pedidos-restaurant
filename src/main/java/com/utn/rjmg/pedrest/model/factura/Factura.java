package com.utn.rjmg.pedrest.model.factura;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.utn.rjmg.pedrest.model.AbstractPersistentObject;
import com.utn.rjmg.pedrest.model.pedido.Pedido;
import com.utn.rjmg.pedrest.model.personas.EmpresaCliente;
import com.utn.rjmg.pedrest.model.personas.EmpresaRestaurant;
@Entity
public class Factura extends AbstractPersistentObject {
	
	@OneToMany(mappedBy = "factura", fetch = FetchType.LAZY)	  
	private List<Pedido> pedidoList;
	@ManyToOne
	private EmpresaCliente empresaCliente;
	@ManyToOne
	private EmpresaRestaurant empresaRestaurant;
	
	private Date fecha;
	private Long numero;
	private Double subtotal;
	private Double total;
	
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
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Long getNumero() {
		return numero;
	}
	public void setNumero(Long numero) {
		this.numero = numero;
	}
	public Double getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(Double subtotal) {
		this.subtotal = subtotal;
	}
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	
}
