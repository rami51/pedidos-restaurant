package com.utn.rjmg.pedrest.specification.pedido;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import com.utn.rjmg.pedrest.model.pedido.Horario;
import com.utn.rjmg.pedrest.specification.base.AbstractBaseSpecification;

public class HorarioSpecification extends AbstractBaseSpecification<Horario> {
	
	HorarioFilter filter;
	
	@Override
	public Predicate toPredicate(Root<Horario> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
		Path<String> nombre = root.get("nombre");
	
		final List<Predicate> predicates = new ArrayList<Predicate>();
		if (filter.getFilterHorario() != null) {
			predicates.add(criteriaBuilder.like(nombre, "%"+filter.getFilterHorario()+"%"));
		}
		
		return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
	}

	public HorarioFilter getFilter() {
		return filter;
	}

	public void setFilter(HorarioFilter filter) {
		this.filter = filter;
	}
	
	
	
}