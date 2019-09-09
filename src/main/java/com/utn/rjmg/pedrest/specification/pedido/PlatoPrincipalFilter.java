package com.utn.rjmg.pedrest.specification.pedido;

public class PlatoPrincipalFilter {
private String filterName;
private Boolean filterHorno;
private Boolean filterSalsa;
private Boolean filterGuarnicion;

public String getFilterName() {
	return filterName;
}
public void setFilterName(String filterName) {
	this.filterName = filterName;
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
