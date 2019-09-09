package com.utn.rjmg.pedrest.specification.comida;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import com.utn.rjmg.pedrest.model.comida.Bebida;
import com.utn.rjmg.pedrest.model.comida.Guarnicion;
import com.utn.rjmg.pedrest.specification.base.AbstractBaseSpecification;

public class GuarnicionSpecification extends AbstractBaseSpecification<Guarnicion> {
	
	GuarnicionFilter filter;
	
	@Override
	public Predicate toPredicate(Root<Guarnicion> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) 
	{
		Path<String> nombre = root.get("nombre");
        Path<Boolean> tieneComponente = root.get("maxCantidadComponentes");
		final List<Predicate> predicates = new ArrayList<Predicate>();
		if (filter.getFilterName() != null) 
		{
			predicates.add(criteriaBuilder.like(nombre, "%"+filter.getFilterName()+"%"));
		}	
		if (filter.getFilterConditionComponent() != null) 
		{
		predicates.add(criteriaBuilder.equal(tieneComponente, filter.getFilterConditionComponent()));	
		}
		return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
	}
	
	public GuarnicionFilter getFilter() {
		return filter;
	}

	public void setFilter(GuarnicionFilter filter) {
		this.filter = filter;
	}
	
	
	
}