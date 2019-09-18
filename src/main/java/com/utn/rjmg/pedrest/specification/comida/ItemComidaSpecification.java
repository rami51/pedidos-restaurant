package com.utn.rjmg.pedrest.specification.comida;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import com.utn.rjmg.pedrest.model.comida.ItemComida;
import com.utn.rjmg.pedrest.specification.base.AbstractBaseSpecification;

public class ItemComidaSpecification extends AbstractBaseSpecification<ItemComida> {
	ItemComidaFilter filter;
	
	@Override
	public Predicate toPredicate(Root<ItemComida> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
		Path<String> nombre = root.get("nombre");
		Path<Boolean> componente = root.get("componente");
		Path<Integer> maxCantidadComponentes = root.get("maxCantidadComponentes");
		Path<Boolean> habilitado = root.get("habilitado");
		
		final List<Predicate> predicates = new ArrayList<Predicate>();
		if (filter.getFilterNombre() != null) {
			predicates.add(criteriaBuilder.like(nombre, "%"+filter.getFilterNombre()+"%"));
		}
		if (filter.getFilterBooleanComponente() != null) {
			predicates.add(criteriaBuilder.equal(componente, filter.getFilterBooleanComponente()));
		}
		if (filter.getFilterMaxCantidadComponentes() != null) {
			predicates.add(criteriaBuilder.equal(maxCantidadComponentes, filter.getFilterMaxCantidadComponentes()));
		}
		if (filter.getFilterBooleanHabilitado() != null) {
			predicates.add(criteriaBuilder.equal(habilitado, filter.getFilterBooleanHabilitado()));
		}
		
		return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
	}

	public ItemComidaFilter getFilter() {
		return filter;
	}

	public void setFilter(ItemComidaFilter filter) {
		this.filter = filter;
	}
}
