package com.utn.rjmg.pedrest.model.usuario;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import com.utn.rjmg.pedrest.model.AbstractPersistentObject;

@Entity
public class UsuarioPerfil extends AbstractPersistentObject {
	@ManyToOne	  
	private Usuario usuario;
	@ManyToOne	  
	private Perfil perfil;
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Perfil getPerfil() {
		return perfil;
	}
	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}
}
