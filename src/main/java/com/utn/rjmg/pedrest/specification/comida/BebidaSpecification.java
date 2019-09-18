package com.utn.rjmg.pedrest.specification.comida;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import com.utn.rjmg.pedrest.model.comida.Bebida;
import com.utn.rjmg.pedrest.model.comida.ItemComida;
import com.utn.rjmg.pedrest.specification.base.AbstractBaseSpecification;

public class BebidaSpecification extends AbstractBaseSpecification<Bebida> {
	
	BebidaFilter filter;
	
	@Override
	public Predicate toPredicate(Root<Bebida> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
		Path<String> light = root.get("light");
	
		final List<Predicate> predicates = new ArrayList<Predicate>();
		if (filter.getFilterLight() != null) {
			predicates.add(criteriaBuilder.equal(light, filter.getFilterLight()));
		}
		
		this.setItemComidaFiltersOnCriteriaBuilder(root, query, criteriaBuilder);
		
		return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
	}

	public BebidaFilter getFilter() {
		return filter;
	}

	public void setFilter(BebidaFilter filter) {
		this.filter = filter;
	}
	
	private void setItemComidaFiltersOnCriteriaBuilder(Root<Bebida> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
		ItemComidaSpecification itemComidaSpec = new ItemComidaSpecification();
		itemComidaSpec.setFilter(filter.getItemComidaFilter());
		Predicate itemComidaPredicate = itemComidaSpec.toPredicate((Root<ItemComida>) root.as(ItemComida.class), query, criteriaBuilder);
		criteriaBuilder.and(itemComidaPredicate);
	}
	
	
	
}