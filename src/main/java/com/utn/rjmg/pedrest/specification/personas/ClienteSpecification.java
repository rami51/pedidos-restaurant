package com.utn.rjmg.pedrest.specification.personas;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import com.utn.rjmg.pedrest.model.comida.Bebida;
import com.utn.rjmg.pedrest.model.personas.Cliente;
import com.utn.rjmg.pedrest.model.personas.EmpresaCliente;
import com.utn.rjmg.pedrest.specification.base.AbstractBaseSpecification;

public class ClienteSpecification extends AbstractBaseSpecification<Cliente> {
	
	ClienteFilter filter;
	
	@Override
	public Predicate toPredicate(Root<Cliente> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
		Path<String> nombre = root.get("nombre");
		Path<String> apellido = root.get("apellido");
		Path<EmpresaCliente> empresa = root.get("empresa");
	
		final List<Predicate> predicates = new ArrayList<Predicate>();
		if (filter.getFilterName() != null) {
			predicates.add(criteriaBuilder.like(nombre, "%"+filter.getFilterName()+"%"));
		}
		if (filter.getFilterSurname() != null) {
			predicates.add(criteriaBuilder.like(apellido, "%"+filter.getFilterSurname()+"%"));
		}
		if (filter.getFilterCompany() != null) {
			predicates.add(criteriaBuilder.equal(empresa, filter.getFilterCompany()));
		}
		
		
		return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
	}

	public ClienteFilter getFilter() {
		return filter;
	}

	public void setFilter(ClienteFilter filter) {
		this.filter = filter;
	}
	
	
	
}