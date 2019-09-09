package com.utn.rjmg.pedrest.model.comida;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import com.utn.rjmg.pedrest.model.AbstractPersistentObject;

@Entity
public class ComponenteItemComida extends AbstractPersistentObject 
{
	private String nombre;
	
	@OneToMany(mappedBy = "componenteItemComida", fetch = FetchType.LAZY)	  
	private List<ItemComidaComponenteItemComida> itemComidaComponenteItemComidaList;

	public List<ItemComidaComponenteItemComida> getItemComidaComponenteItemComidaList() {
		return itemComidaComponenteItemComidaList;
	}

	public void setItemComidaComponenteItemComidaList(
			List<ItemComidaComponenteItemComida> itemComidaComponenteItemComidaList) {
		this.itemComidaComponenteItemComidaList = itemComidaComponenteItemComidaList;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
