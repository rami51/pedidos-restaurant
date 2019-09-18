package com.utn.rjmg.pedrest.specification.comida;

public class PlatoPrincipalFilter {
	private Boolean filterHorno;
	private Boolean filterSalsa;
	private Boolean filterGuarnicion;
	private ItemComidaFilter itemComidaFilter;
	
	public ItemComidaFilter getItemComidaFilter() {
		return itemComidaFilter;
	}
	public void setItemComidaFilter(ItemComidaFilter itemComidaFilter) {
		this.itemComidaFilter = itemComidaFilter;
	}
	public Boolean getFilterHorno() {
		return filterHorno;
	}
	public void setFilterHorno(Boolean filterHorno) {
		this.filterHorno = filterHorno;
	}
	public Boolean getFilterSalsa() {
		return filterSalsa;
	}
	public void setFilterSalsa(Boolean filterSalsa) {
		this.filterSalsa = filterSalsa;
	}
	public Boolean getFilterGuarnicion() {
		return filterGuarnicion;
	}
	public void setFilterGuarnicion(Boolean filterGuarnicion) {
		this.filterGuarnicion = filterGuarnicion;
	}
}
