package com.utn.rjmg.pedrest.model.personas;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import com.utn.rjmg.pedrest.model.AbstractPersistentObject;
import com.utn.rjmg.pedrest.model.factura.Factura;
@Entity
public class EmpresaRestaurant extends AbstractPersistentObject {

	@OneToMany(mappedBy = "empresaRestaurant", fetch = FetchType.LAZY)	  
	private List<Factura> facturaList;

	public List<Factura> getFacturaList() {
		return facturaList;
	}

	public void setFacturaList(List<Factura> facturaList) {
		this.facturaList = facturaList;
	}
	
}
