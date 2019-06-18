package com.utn.rjmg.pedrest.model.pedido;

import java.time.LocalTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import com.utn.rjmg.pedrest.model.AbstractPersistentObject;
import com.utn.rjmg.pedrest.model.factura.Factura;
@Entity
public class Horario extends AbstractPersistentObject {
	
	@OneToMany(mappedBy = "horario", fetch = FetchType.LAZY)	  
	private List<Pedido> pedidoList;
	
	private LocalTime horario;

	public LocalTime getHorario() {
		return horario;
	}

	public void setHorario(LocalTime horario) {
		this.horario = horario;
	}
}
