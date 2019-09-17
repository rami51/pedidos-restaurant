package com.utn.rjmg.pedrest.specification.usuario;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import com.utn.rjmg.pedrest.model.usuario.Usuario;
import com.utn.rjmg.pedrest.specification.base.AbstractBaseSpecification;

public class UsuarioSpecification extends AbstractBaseSpecification<Usuario> {
	
	UsuarioFilter filter;
	
	@Override
	public Predicate toPredicate(Root<Usuario> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
		Path<String> nombre = root.get("nombre");
		Path<String> tipoUsuario = root.get("tipoUsuario");
	
		final List<Predicate> predicates = new ArrayList<Predicate>();
		if (filter.getFilterName() != null) {
			predicates.add(criteriaBuilder.like(nombre, "%"+filter.getFilterName()+"%"));
		}	
		/*ENTIENDO QUE ESTO NO SERÍA ASÍ*/
		if (filter.getFilterTipoUsuario() != null) {
			predicates.add(criteriaBuilder.like(tipoUsuario, "%"+filter.getFilterTipoUsuario()+"%"));
		}
		return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
	}

	public UsuarioFilter getFilter() {
		return filter;
	}

	public void setFilter(UsuarioFilter filter) {
		this.filter = filter;
	}
	
	
}