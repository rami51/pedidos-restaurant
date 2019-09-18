package com.utn.rjmg.pedrest.specification.pedido;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import com.utn.rjmg.pedrest.model.pedido.Pedido;
import com.utn.rjmg.pedrest.model.personas.EmpresaCliente;
import com.utn.rjmg.pedrest.specification.base.AbstractBaseSpecification;

public class PedidoSpecification extends AbstractBaseSpecification<Pedido> {
	
	PedidoFilter filter;
	
	@Override
	public Predicate toPredicate(Root<Pedido> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
		//TODO: falta este Specification. Va con joins.
		
	
		final List<Predicate> predicates = new ArrayList<Predicate>();
		
		return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
	}

	public PedidoFilter getFilter() {
		return filter;
	}

	public void setFilter(PedidoFilter filter) {
		this.filter = filter;
	}
	
	
	
}