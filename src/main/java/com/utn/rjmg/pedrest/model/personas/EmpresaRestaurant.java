package com.utn.rjmg.pedrest.model.personas;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import com.utn.rjmg.pedrest.model.AbstractPersistentObject;
import com.utn.rjmg.pedrest.model.factura.Factura;
@Entity
public class EmpresaRestaurant extends AbstractPersistentObject {
	
	private String razonSocial;
	private String direccion;
	private String email;
	private String telefono;
	private String cuit;
	
	@OneToMany(mappedBy = "empresaRestaurant", fetch = FetchType.LAZY)
	private List<Empleado> empleadoList;
	@OneToMany(mappedBy = "empresaRestaurant", fetch = FetchType.LAZY)	  
	private List<Factura> facturaList;

	public List<Factura> getFacturaList() {
		return facturaList;
	}

	public void setFacturaList(List<Factura> facturaList) {
		this.facturaList = facturaList;
	}

	public List<Empleado> getEmpleadoList() {
		return empleadoList;
	}

	public void setEmpleadoList(List<Empleado> empleadoList) {
		this.empleadoList = empleadoList;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCuit() {
		return cuit;
	}

	public void setCuit(String cuit) {
		this.cuit = cuit;
	}
}
