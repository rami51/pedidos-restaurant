package com.utn.rjmg.pedrest.specification.comida;

public class ItemComidaFilter {
	private String filterNombre;
	private Boolean filterBooleanComponente;
	private Integer filterMaxCantidadComponentes;
	private Boolean filterBooleanHabilitado;
	
	public String getFilterNombre() {
		return filterNombre;
	}
	public void setFilterNombre(String filterNombre) {
		this.filterNombre = filterNombre;
	}
	public Boolean getFilterBooleanComponente() {
		return filterBooleanComponente;
	}
	public void setFilterBooleanComponente(Boolean filterBooleanComponente) {
		this.filterBooleanComponente = filterBooleanComponente;
	}
	public Integer getFilterMaxCantidadComponentes() {
		return filterMaxCantidadComponentes;
	}
	public void setFilterMaxCantidadComponentes(Integer filterMaxCantidadComponentes) {
		this.filterMaxCantidadComponentes = filterMaxCantidadComponentes;
	}
	public Boolean getFilterBooleanHabilitado() {
		return filterBooleanHabilitado;
	}
	public void setFilterBooleanHabilitado(Boolean filterBooleanHabilitado) {
		this.filterBooleanHabilitado = filterBooleanHabilitado;
	}
}
