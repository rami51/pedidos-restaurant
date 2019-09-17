package com.utn.rjmg.pedrest.specification.usuario;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import com.utn.rjmg.pedrest.model.usuario.Perfil;
import com.utn.rjmg.pedrest.specification.base.AbstractBaseSpecification;

public class PerfilSpecification extends AbstractBaseSpecification<Perfil> {
	
	PerfilFilter filter;
	
	@Override
	public Predicate toPredicate(Root<Perfil> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
		Path<String> nombre = root.get("nombre");
		Path<String> codigo = root.get("codigo");
	
		final List<Predicate> predicates = new ArrayList<Predicate>();
		if (filter.getFilterName() != null) {
			predicates.add(criteriaBuilder.like(nombre, "%"+filter.getFilterName()+"%"));
		}	
		if (filter.getFilterCodigo() != null) {
			predicates.add(criteriaBuilder.like(codigo, "%"+filter.getFilterCodigo()+"%"));
		}
		return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
	}

	public PerfilFilter getFilter() {
		return filter;
	}

	public void setFilter(PerfilFilter filter) {
		this.filter = filter;
	}
	
	
	
}