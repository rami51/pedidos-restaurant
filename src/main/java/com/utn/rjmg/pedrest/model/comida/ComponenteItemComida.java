package com.utn.rjmg.pedrest.model.comida;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import com.utn.rjmg.pedrest.model.AbstractPersistentObject;

@Entity
public class ComponenteItemComida extends AbstractPersistentObject 
{
	@OneToMany(mappedBy = "componenteItemComida", fetch = FetchType.LAZY)	  
	private List<ItemComidaComponenteItemComida> itemComidaComponenteItemComidaList;
}
