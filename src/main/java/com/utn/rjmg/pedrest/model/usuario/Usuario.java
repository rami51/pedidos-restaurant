package com.utn.rjmg.pedrest.model.usuario;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.utn.rjmg.pedrest.model.AbstractPersistentObject;
import com.utn.rjmg.pedrest.model.personas.Cliente;
import com.utn.rjmg.pedrest.model.personas.Empleado;
@Entity
public class Usuario extends AbstractPersistentObject {
	
	@OneToMany(mappedBy = "usuario", fetch = FetchType.LAZY)	  
	private List<Cliente> clienteList;
	@OneToMany(mappedBy = "usuario", fetch = FetchType.LAZY)	  
	private List<Empleado> empleadoList;
	
	@OneToOne
	private Perfil perfil;

}
