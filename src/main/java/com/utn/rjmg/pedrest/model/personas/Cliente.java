package com.utn.rjmg.pedrest.model.personas;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.utn.rjmg.pedrest.model.AbstractPersistentObject;
import com.utn.rjmg.pedrest.model.pedido.Pedido;
import com.utn.rjmg.pedrest.model.usuario.Usuario;
@Entity
public class Cliente extends AbstractPersistentObject {
	@OneToMany(mappedBy="cliente", fetch=FetchType.LAZY)
	private List<Pedido> pedidoList;
	
	@OneToOne
	private Usuario usuario;
	
	@ManyToOne
	private EmpresaCliente empresa;
	
	private String nombre;
	private String apellido;
	private String telefono;
	private String email;
	
	public List<Pedido> getPedidoList() {
		return pedidoList;
	}
	public void setPedido(List<Pedido> pedido) {
		this.pedidoList = pedido;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public EmpresaCliente getEmpresa() {
		return empresa;
	}
	public void setEmpresa(EmpresaCliente empresa) {
		this.empresa = empresa;
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
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPedidoList(List<Pedido> pedidoList) {
		this.pedidoList = pedidoList;
	}
}
