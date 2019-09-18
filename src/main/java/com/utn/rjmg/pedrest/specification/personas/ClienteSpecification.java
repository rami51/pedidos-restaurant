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
		Path<String> telefono = root.get("telefono");
		Path<String> email = root.get("email");
		
		Path<EmpresaCliente> empresa = root.get("empresa");
		Path<String> razonSocialEmpresa = empresa.get("razonSocial");
	
		final List<Predicate> predicates = new ArrayList<Predicate>();
		if (filter.getFilterName() != null) {
			predicates.add(criteriaBuilder.like(nombre, "%"+filter.getFilterName()+"%"));
		}
		if (filter.getFilterLastname() != null) {
			predicates.add(criteriaBuilder.like(apellido, "%"+filter.getFilterLastname()+"%"));
		}
		if (filter.getFilterCompanyName() != null) {
			predicates.add(criteriaBuilder.like(razonSocialEmpresa, "%"+filter.getFilterCompanyName()+"%"));
		}
		if (filter.getFilterPhone() != null) {
			predicates.add(criteriaBuilder.equal(telefono, filter.getFilterPhone()));
		}
		if (filter.getFilterEmail() != null) {
			predicates.add(criteriaBuilder.like(criteriaBuilder.lower(email), filter.getFilterEmail().toLowerCase()));
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