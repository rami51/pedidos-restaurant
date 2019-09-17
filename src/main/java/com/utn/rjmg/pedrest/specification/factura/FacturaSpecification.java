package com.utn.rjmg.pedrest.specification.factura;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import com.utn.rjmg.pedrest.model.factura.Factura;
import com.utn.rjmg.pedrest.model.personas.Cliente;
import com.utn.rjmg.pedrest.model.personas.EmpresaCliente;
import com.utn.rjmg.pedrest.specification.base.AbstractBaseSpecification;

public class FacturaSpecification extends AbstractBaseSpecification<Factura> {
	
	FacturaFilter filter;
	
	@Override
	public Predicate toPredicate(Root<Factura> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
		Path<Cliente> cliente = root.get("cliente");
		Path<EmpresaCliente> empresa = root.get("empresa");
		/*habia para importar otra fecha que estaba en util, elegi la de java*/
		Path<Date> fecha = root.get("fecha");
	
		final List<Predicate> predicates = new ArrayList<Predicate>();
		
		if (filter.getFilterCompany() != null) {
			predicates.add(criteriaBuilder.equal(empresa, filter.getFilterCompany()));
		}
		if (filter.getFilterClient() != null) {
			predicates.add(criteriaBuilder.equal(empresa, filter.getFilterClient()));
		}
		if (filter.getFilteDate() != null) {
			predicates.add(criteriaBuilder.equal(fecha, filter.getFilteDate()));
		}
		
		return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
	}

	public FacturaFilter getFilter() {
		return filter;
	}

	public void setFilter(FacturaFilter filter) {
		this.filter = filter;
	}
	
	
	
}