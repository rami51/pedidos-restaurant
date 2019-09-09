package com.utn.rjmg.pedrest.specification.comida;

public class AdicionalesFilter 
{
	private String filterName;	
	private Boolean  filterConditionComponent;
	public String getFilterName() {
		return filterName;
	}
	public void setFilterName(String filterName) {
		this.filterName = filterName;
	}
	public Boolean getFilterConditionComponent() {
		return filterConditionComponent;
	}
	public void setFilterConditionComponent(Boolean filterConditionComponent) {
		this.filterConditionComponent = filterConditionComponent;
	}
	
}
