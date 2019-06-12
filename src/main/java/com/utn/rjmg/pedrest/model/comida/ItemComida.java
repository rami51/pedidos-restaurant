package com.utn.rjmg.pedrest.model.comida;

import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;

import com.utn.rjmg.pedrest.model.AbstractPersistentObject;


@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class ItemComida extends AbstractPersistentObject 
{
	private String nombre;
	private Double precio;
	private Boolean componente;
	private Integer maxCantidadComponentes;
	
	@OneToMany(mappedBy = "itemComida", fetch = FetchType.LAZY)	  
	private List<ItemComidaComponenteItemComida> itemComidaComponenteItemComidaList;
		
	@OneToMany(mappedBy = "itemComida", fetch = FetchType.LAZY)	  
	private List<ItemComidaMenuDia> itemComidaMenuDiaList;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public Boolean getComponente() {
		return componente;
	}
	public void setComponente(Boolean componente) {
		this.componente = componente;
	}
	public Integer getMaxCantidadComponentes() {
		return maxCantidadComponentes;
	}
	public void setMaxCantidadComponentes(Integer maxCantidadComponentes) {
		this.maxCantidadComponentes = maxCantidadComponentes;
	}
}
