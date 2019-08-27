package com.utn.rjmg.pedrest.model.usuario;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotEmpty;

import com.utn.rjmg.pedrest.model.AbstractPersistentObject;
import com.utn.rjmg.pedrest.model.personas.Cliente;
import com.utn.rjmg.pedrest.model.personas.Empleado;
@Entity
public class Usuario extends AbstractPersistentObject {
	
	@OneToMany(mappedBy = "usuario", fetch = FetchType.LAZY)	  
	private List<Cliente> clienteList;
	@OneToMany(mappedBy = "usuario", fetch = FetchType.LAZY)	  
	private List<Empleado> empleadoList;
	@OneToMany(mappedBy = "usuario", fetch = FetchType.LAZY)
	private List<UsuarioPerfil> usuarioPerfilList;
	
	@NotEmpty
	private String username;
	@NotEmpty
	private String password;

	public List<Cliente> getClienteList() {
		return clienteList;
	}

	public void setClienteList(List<Cliente> clienteList) {
		this.clienteList = clienteList;
	}

	public List<Empleado> getEmpleadoList() {
		return empleadoList;
	}

	public void setEmpleadoList(List<Empleado> empleadoList) {
		this.empleadoList = empleadoList;
	}

	public List<UsuarioPerfil> getUsuarioPerfilList() {
		return usuarioPerfilList;
	}

	public void setUsuarioPerfilList(List<UsuarioPerfil> usuarioPerfilList) {
		this.usuarioPerfilList = usuarioPerfilList;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
