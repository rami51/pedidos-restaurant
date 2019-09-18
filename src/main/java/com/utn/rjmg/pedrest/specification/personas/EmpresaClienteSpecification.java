package com.utn.rjmg.pedrest.specification.personas;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import com.utn.rjmg.pedrest.model.comida.Bebida;
import com.utn.rjmg.pedrest.model.personas.EmpresaCliente;
import com.utn.rjmg.pedrest.specification.base.AbstractBaseSpecification;

public class EmpresaClienteSpecification extends AbstractBaseSpecification<EmpresaCliente> {
	
	EmpresaClienteFilter filter;
	
	@Override
	public Predicate toPredicate(Root<EmpresaCliente> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
		Path<String> razonSocial = root.get("razonSocial");
		Path<String> cuit = root.get("cuit");
		Path<String> email = root.get("email");
	
		final List<Predicate> predicates = new ArrayList<Predicate>();
		if (filter.getFilterName() != null) {
			predicates.add(criteriaBuilder.like(criteriaBuilder.lower(razonSocial), "%"+filter.getFilterName().toLowerCase()+"%"));
		}
		if (filter.getFilterCuit() != null) {
			predicates.add(criteriaBuilder.like(cuit, filter.getFilterCuit()));
		}
		if (filter.getFilterEmail() != null) {
			predicates.add(criteriaBuilder.like(criteriaBuilder.lower(email), "%"+filter.getFilterEmail().toLowerCase()+"%"));
		}
		
		
		return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
	}

	public EmpresaClienteFilter getFilter() {
		return filter;
	}

	public void setFilter(EmpresaClienteFilter filter) {
		this.filter = filter;
	}
	
	
	
}