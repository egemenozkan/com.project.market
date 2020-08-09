package com.project.market.model.teztour;

public class TezFlight {

	private Econom econom;
	private PremiumEconom premiumEconom;
	private Business business;

	private String price;

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public Econom getEconom() {
		return econom;
	}

	public void setEconom(Econom econom) {
		this.econom = econom;
	}

	public PremiumEconom getPremiumEconom() {
		return premiumEconom;
	}

	public void setPremiumEconom(PremiumEconom premiumEconom) {
		this.premiumEconom = premiumEconom;
	}

	public Business getBusiness() {
		return business;
	}

	public void setBusiness(Business business) {
		this.business = business;
	}

}