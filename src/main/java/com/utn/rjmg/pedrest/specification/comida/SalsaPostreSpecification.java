package com.utn.rjmg.pedrest.specification.comida;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import com.utn.rjmg.pedrest.model.comida.Salsa;
import com.utn.rjmg.pedrest.specification.base.AbstractBaseSpecification;

public class SalsaPostreSpecification extends AbstractBaseSpecification<Salsa> {
	
	SalsaFilter filter;
	
	@Override
	public Predicate toPredicate(Root<Salsa> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) 
	{
		Path<String> nombre = root.get("nombre");
        final List<Predicate> predicates = new ArrayList<Predicate>();
		if (filter.getFilterName() != null) 
		{
			predicates.add(criteriaBuilder.like(nombre, "%"+filter.getFilterName()+"%"));
		}
		return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
	}
	
	public SalsaFilter getFilter() {
		return filter;
	}

	public void setFilter(SalsaFilter filter) {
		this.filter = filter;
	}
	
	
	
}