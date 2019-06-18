package com.utn.rjmg.pedrest.model.personas;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import com.utn.rjmg.pedrest.model.AbstractPersistentObject;
import com.utn.rjmg.pedrest.model.pedido.Pedido;
import com.utn.rjmg.pedrest.model.usuario.Usuario;
@Entity
public class Cliente extends AbstractPersistentObject {
	@OneToOne
	//@PrimaryKeyJoinColumn
	private Pedido pedido;
	@OneToOne
	//@PrimaryKeyJoinColumn
	private Usuario usuario;
	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}
