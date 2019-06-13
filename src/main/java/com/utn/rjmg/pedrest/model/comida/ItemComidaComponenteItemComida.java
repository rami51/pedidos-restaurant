package com.utn.rjmg.pedrest.model.comida;


import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import com.utn.rjmg.pedrest.model.AbstractPersistentObject;

@Entity
public class ItemComidaComponenteItemComida extends AbstractPersistentObject
{
	@ManyToOne	  
	private ComponenteItemComida componenteItemComida;
	
	@ManyToOne	  
	private ItemComida itemComida;

}
