package com.utn.rjmg.pedrest.model.usuario;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotEmpty;

import com.utn.rjmg.pedrest.model.AbstractPersistentObject;
@Entity
public class Perfil extends AbstractPersistentObject {	
	@OneToMany(mappedBy = "perfil", fetch = FetchType.LAZY)	  
	private List<PerfilPermiso> perfilPermisoList;
	
	@NotEmpty
	private String codigo;
	
	@NotEmpty
	private String descripcion;

	public List<PerfilPermiso> getPerfilPermisoList() {
		return perfilPermisoList;
	}

	public void setPerfilPermisoList(List<PerfilPermiso> perfilPermisoList) {
		this.perfilPermisoList = perfilPermisoList;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}
