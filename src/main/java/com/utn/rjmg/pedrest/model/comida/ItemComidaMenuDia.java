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

}
