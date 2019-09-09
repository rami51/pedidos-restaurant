package com.utn.rjmg.pedrest.model.personas;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.utn.rjmg.pedrest.model.AbstractPersistentObject;
import com.utn.rjmg.pedrest.model.usuario.Usuario;;
@Entity
public class Empleado extends AbstractPersistentObject {
	
	@ManyToOne
	private EmpresaRestaurant empresaRestaurant;
	
	@OneToOne
	private Usuario usuario;
	
	private String nombre;
	private String apellido;
	private String cuil;
	private String email;

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public EmpresaRestaurant getEmpresaRestaurant() {
		return empresaRestaurant;
	}

	public void setEmpresaRestaurant(EmpresaRestaurant empresaRestaurant) {
		this.empresaRestaurant = empresaRestaurant;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCuil() {
		return cuil;
	}

	public void setCuil(String cuil) {
		this.cuil = cuil;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
