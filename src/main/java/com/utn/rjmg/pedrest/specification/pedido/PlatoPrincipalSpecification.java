package com.utn.rjmg.pedrest.specification.pedido;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import com.utn.rjmg.pedrest.model.comida.Guarnicion;
import com.utn.rjmg.pedrest.model.comida.PlatoPrincipal;
import com.utn.rjmg.pedrest.model.comida.Salsa;
import com.utn.rjmg.pedrest.specification.base.AbstractBaseSpecification;

public class PlatoPrincipalSpecification extends AbstractBaseSpecification<PlatoPrincipal> {
	
	PlatoPrincipalFilter filter;
	
	@Override
	public Predicate toPredicate(Root<PlatoPrincipal> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
		Path<String> nombre = root.get("nombre");
		Path<Boolean> horno = root.get("horno");
		Path<Boolean> salsa = root.get("salsa");
		Path<Boolean> guarnicion = root.get("guarnicion");
	
		final List<Predicate> predicates = new ArrayList<Predicate>();
		if (filter.getFilterName() != null) {
			predicates.add(criteriaBuilder.like(nombre, "%"+filter.getFilterName()+"%"));
		}
		if (filter.getFilterHorno()!= null) {
			predicates.add(criteriaBuilder.equal(horno, filter.getFilterHorno()));
		}
		if (filter.getFilterSalsa() != null) {
			predicates.add(criteriaBuilder.equal(salsa, filter.getFilterSalsa()));
		}
		if (filter.getFilterGuarnicion() != null) {
			predicates.add(criteriaBuilder.equal(guarnicion, filter.getFilterGuarnicion()));
		}
		
		return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
	}

	public PlatoPrincipalFilter getFilter() {
		return filter;
	}

	public void setFilter(PlatoPrincipalFilter filter) {
		this.filter = filter;
	}
	
	
	
}