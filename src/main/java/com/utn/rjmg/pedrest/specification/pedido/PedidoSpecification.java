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
		Path<String> nombre = root.get("nombre");
		Path<EmpresaCliente> empresa = root.get("empresa");
		Path<String> horario = root.get("horariio");
		Path<String> estado = root.get("estado");
	
		final List<Predicate> predicates = new ArrayList<Predicate>();
		if (filter.getFilterName() != null) {
			predicates.add(criteriaBuilder.like(nombre, "%"+filter.getFilterName()+"%"));
		}
		if (filter.getFilterEmpresa() != null) {
			predicates.add(criteriaBuilder.equal(empresa, filter.getFilterEmpresa()));
		}
		if (filter.getFilterHorario() != null) {
			predicates.add(criteriaBuilder.like(horario, "%"+filter.getFilterHorario()+"%"));
		}
		if (filter.getFilterEstado() != null) {
			predicates.add(criteriaBuilder.like(estado, "%"+filter.getFilterEstado()+"%"));
		}
		
		return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
	}

	public PedidoFilter getFilter() {
		return filter;
	}

	public void setFilter(PedidoFilter filter) {
		this.filter = filter;
	}
	
	
	
}