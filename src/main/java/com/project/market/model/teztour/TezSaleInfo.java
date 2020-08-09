package com.project.market.model.teztour;

import java.math.BigDecimal;
import java.util.ArrayList;

public class TezSaleInfo {
	private String currency;
	private int currencyId;
	private BigDecimal total;
	ArrayList<Object> residences = new ArrayList<Object>();
	ArrayList<Object> flightsTo = new ArrayList<Object>();
	ArrayList<Object> flightsFrom = new ArrayList<Object>();
	private String insurance;
	private String other;
	ArrayList<Object> priceTypes = new ArrayList<Object>();
	private boolean specialSell;

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public int getCurrencyId() {
		return currencyId;
	}

	public void setCurrencyId(int currencyId) {
		this.currencyId = currencyId;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	public ArrayList<Object> getResidences() {
		return residences;
	}

	public void setResidences(ArrayList<Object> residences) {
		this.residences = residences;
	}

	public ArrayList<Object> getFlightsTo() {
		return flightsTo;
	}

	public void setFlightsTo(ArrayList<Object> flightsTo) {
		this.flightsTo = flightsTo;
	}

	public ArrayList<Object> getFlightsFrom() {
		return flightsFrom;
	}

	public void setFlightsFrom(ArrayList<Object> flightsFrom) {
		this.flightsFrom = flightsFrom;
	}

	public String getInsurance() {
		return insurance;
	}

	public void setInsurance(String insurance) {
		this.insurance = insurance;
	}

	public String getOther() {
		return other;
	}

	public void setOther(String other) {
		this.other = other;
	}

	public ArrayList<Object> getPriceTypes() {
		return priceTypes;
	}

	public void setPriceTypes(ArrayList<Object> priceTypes) {
		this.priceTypes = priceTypes;
	}

	public boolean isSpecialSell() {
		return specialSell;
	}

	public void setSpecialSell(boolean specialSell) {
		this.specialSell = specialSell;
	}

}