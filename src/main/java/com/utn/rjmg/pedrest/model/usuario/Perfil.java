package com.utn.rjmg.pedrest.model.usuario;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import com.utn.rjmg.pedrest.model.AbstractPersistentObject;
@Entity
public class Perfil extends AbstractPersistentObject {	
	@OneToMany(mappedBy = "perfil", fetch = FetchType.LAZY)	  
	private List<PerfilPermiso> perfilPermisoList;

	public List<PerfilPermiso> getPerfilPermisoList() {
		return perfilPermisoList;
	}

	public void setPerfilPermisoList(List<PerfilPermiso> perfilPermisoList) {
		this.perfilPermisoList = perfilPermisoList;
	}
	
}
