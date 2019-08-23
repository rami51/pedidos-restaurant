package com.utn.rjmg.pedrest.specification.comida;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import com.utn.rjmg.pedrest.model.comida.Bebida;
import com.utn.rjmg.pedrest.specification.base.AbstractBaseSpecification;

public class BebidaSpecification extends AbstractBaseSpecification<Bebida> {
	
	BebidaFilter filter;
	
	@Override
	public Predicate toPredicate(Root<Bebida> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
		Path<String> nombre = root.get("nombre");
	
		final List<Predicate> predicates = new ArrayList<Predicate>();
		if (filter.getRamirou() != null) {
			predicates.add(criteriaBuilder.equal(nombre, filter.getRamirou()));
		}
		
		return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
	}

	public BebidaFilter getFilter() {
		return filter;
	}

	public void setFilter(BebidaFilter filter) {
		this.filter = filter;
	}
	
	
	
}