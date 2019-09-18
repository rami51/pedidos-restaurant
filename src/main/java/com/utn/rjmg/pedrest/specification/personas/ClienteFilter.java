package com.utn.rjmg.pedrest.specification.personas;

public class ClienteFilter {
	private String filterName;
	private String filterLastname;
	private String filterCompanyName;
	private String filterPhone;
	private String filterEmail;

	public String getFilterName() {
		return filterName;	
	}

	public void setFilterName(String filterName) {
		this.filterName = filterName;
	}

	public String getFilterLastname() {
		return filterLastname;
	}

	public void setFilterLastname(String filterLastname) {
		this.filterLastname = filterLastname;
	}

	public String getFilterCompanyName() {
		return filterCompanyName;
	}

	public void setFilterCompanyName(String filterCompanyName) {
		this.filterCompanyName = filterCompanyName;
	}

	public String getFilterPhone() {
		return filterPhone;
	}

	public void setFilterPhone(String filterPhone) {
		this.filterPhone = filterPhone;
	}

	public String getFilterEmail() {
		return filterEmail;
	}

	public void setFilterEmail(String filterEmail) {
		this.filterEmail = filterEmail;
	}
	
}
