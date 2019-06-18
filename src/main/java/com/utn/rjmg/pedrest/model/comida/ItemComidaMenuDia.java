package com.utn.rjmg.pedrest.model.comida;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import com.utn.rjmg.pedrest.model.AbstractPersistentObject;
@Entity
public class ItemComidaMenuDia extends AbstractPersistentObject{
	
	@ManyToOne	  
	private MenuDia menuDia;
	
	@ManyToOne	  
	private ItemComida itemComida;

	public MenuDia getMenuDia() {
		return menuDia;
	}

	public void setMenuDia(MenuDia menuDia) {
		this.menuDia = menuDia;
	}

	public ItemComida getItemComida() {
		return itemComida;
	}

	public void setItemComida(ItemComida itemComida) {
		this.itemComida = itemComida;
	}
}
