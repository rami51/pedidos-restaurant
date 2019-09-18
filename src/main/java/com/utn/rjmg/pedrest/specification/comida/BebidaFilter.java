package com.utn.rjmg.pedrest.specification.comida;

public class BebidaFilter {
	private ItemComidaFilter itemComidaFilter;
	private Boolean filterLight;

	public Boolean getFilterLight() {
		return filterLight;
	}

	public void setFilterLight(Boolean filterLight) {
		this.filterLight = filterLight;
	}

	public ItemComidaFilter getItemComidaFilter() {
		return itemComidaFilter;
	}

	public void setItemComidaFilter(ItemComidaFilter itemComidaFilter) {
		this.itemComidaFilter = itemComidaFilter;
	}

	
}
