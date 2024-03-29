package com.utn.rjmg.pedrest.model.comida;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import com.utn.rjmg.pedrest.model.AbstractPersistentObject;
@Entity
public class MenuDia extends AbstractPersistentObject 
{
	private DiaSemana dia;
	@OneToMany(mappedBy = "menuDia", fetch = FetchType.LAZY)	  
	private List<ItemComidaMenuDia> itemComidaMenuDiaList;

	public List<ItemComidaMenuDia> getItemComidaMenuDiaList() {
		return itemComidaMenuDiaList;
	}

	public void setItemComidaMenuDiaList(List<ItemComidaMenuDia> itemComidaMenuDiaList) {
		this.itemComidaMenuDiaList = itemComidaMenuDiaList;
	}

	public DiaSemana getDia() {
		return dia;
	}

	public void setDia(DiaSemana dia) {
		this.dia = dia;
	}
	
}
