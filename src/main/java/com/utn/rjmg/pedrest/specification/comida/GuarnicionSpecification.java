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
import com.utn.rjmg.pedrest.model.comida.ItemComida;
import com.utn.rjmg.pedrest.specification.base.AbstractBaseSpecification;

public class GuarnicionSpecification extends AbstractBaseSpecification<Guarnicion> {
	
	GuarnicionFilter filter;
	
	@Override
	public Predicate toPredicate(Root<Guarnicion> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) 
	{
		final List<Predicate> predicates = new ArrayList<Predicate>();
		
		this.setItemComidaFiltersOnCriteriaBuilder(root, query, criteriaBuilder);
		
		return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
	}
	
	public GuarnicionFilter getFilter() {
		return filter;
	}

	public void setFilter(GuarnicionFilter filter) {
		this.filter = filter;
	}
	
	private void setItemComidaFiltersOnCriteriaBuilder(Root<Guarnicion> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
		ItemComidaSpecification itemComidaSpec = new ItemComidaSpecification();
		itemComidaSpec.setFilter(filter.getItemComidaFilter());
		Predicate itemComidaPredicate = itemComidaSpec.toPredicate((Root<ItemComida>) root.as(ItemComida.class), query, criteriaBuilder);
		criteriaBuilder.and(itemComidaPredicate);
	}
	
}