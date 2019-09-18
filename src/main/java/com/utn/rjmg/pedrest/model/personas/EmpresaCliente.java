package com.utn.rjmg.pedrest.model.personas;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import com.utn.rjmg.pedrest.model.AbstractPersistentObject;
import com.utn.rjmg.pedrest.model.factura.Factura;
@Entity
public class EmpresaCliente extends AbstractPersistentObject {
	
	private String razonSocial;
	private String cuit;
	private String direccion;
	private String mail;
	private String telefono;
	private Boolean descuento;
	private Double porcentajeDescuento;
	
	@OneToMany(mappedBy = "empresaCliente", fetch = FetchType.LAZY)	  
	private List<Factura> facturaList;

	@OneToMany(mappedBy = "empresa", fetch = FetchType.LAZY)	  
	private List<Cliente> clienteList;
	
	public List<Factura> getFacturaList() {
		return facturaList;
	}

	public void setFacturaList(List<Factura> facturaList) {
		this.facturaList = facturaList;
	}

	public List<Cliente> getClienteList() {
		return clienteList;
	}

	public void setClienteList(List<Cliente> clienteList) {
		this.clienteList = clienteList;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Boolean getDescuento() {
		return descuento;
	}

	public void setDescuento(Boolean descuento) {
		this.descuento = descuento;
	}

	public Double getPorcentajeDescuento() {
		return porcentajeDescuento;
	}

	public void setPorcentajeDescuento(Double porcentajeDescuento) {
		this.porcentajeDescuento = porcentajeDescuento;
	}

	public String getCuit() {
		return cuit;
	}

	public void setCuit(String cuit) {
		this.cuit = cuit;
	}
	
}
