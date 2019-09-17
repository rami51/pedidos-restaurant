package com.utn.rjmg.pedrest.specification.factura;

import java.sql.Date;

public class FacturaFilter {
	private String filterClient;
	private String filterCompany;
	private Date filteDate;
	public String getFilterClient() {
		return filterClient;
	}
	public void setFilterClient(String filterClient) {
		this.filterClient = filterClient;
	}
	public String getFilterCompany() {
		return filterCompany;
	}
	public void setFilterCompany(String filterCompany) {
		this.filterCompany = filterCompany;
	}
	public Date getFilteDate() {
		return filteDate;
	}
	public void setFilteDate(Date filteDate) {
		this.filteDate = filteDate;
	}
	
	
	
	
}
