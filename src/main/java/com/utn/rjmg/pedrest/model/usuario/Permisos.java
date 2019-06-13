package com.utn.rjmg.pedrest.model.usuario;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import com.utn.rjmg.pedrest.model.AbstractPersistentObject;
@Entity
public class Permisos extends AbstractPersistentObject {
	
	@OneToMany(mappedBy = "permisos", fetch = FetchType.LAZY)	  
	private List<PerfilPermiso> perfilPermisoList;

}
