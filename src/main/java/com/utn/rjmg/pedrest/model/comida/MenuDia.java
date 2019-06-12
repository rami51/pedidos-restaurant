package com.utn.rjmg.pedrest.model.comida;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import com.utn.rjmg.pedrest.model.AbstractPersistentObject;
@Entity
public class MenuDia extends AbstractPersistentObject 
{
	@OneToMany(mappedBy = "menuDia", fetch = FetchType.LAZY)	  
	private List<ItemComidaMenuDia> itemComidaMenuDiaList;
	
	
}
