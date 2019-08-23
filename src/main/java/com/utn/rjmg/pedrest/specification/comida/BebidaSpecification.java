package com.utn.rjmg.pedrest.specification.comida;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import com.utn.rjmg.pedrest.model.comida.Bebida;
import com.utn.rjmg.pedrest.model.comida.Bebida_;
import com.utn.rjmg.pedrest.model.comida.ItemComida;
import com.utn.rjmg.pedrest.specification.base.AbstractBaseSpecification;

public class BebidaSpecification extends AbstractBaseSpecification<Bebida> {
	
	BebidaFilter filter;
	
	@Override
	public Predicate toPredicate(Root<Bebida> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
		Join<Bebida, ItemComida> itemComidaJoin = root.join(Bebida_.ID);
		
		Path<ItemComida> itemComida = root.get(map)
		return null;
	}

	public BebidaFilter getFilter() {
		return filter;
	}

	public void setFilter(BebidaFilter filter) {
		this.filter = filter;
	}
	
	
	
}