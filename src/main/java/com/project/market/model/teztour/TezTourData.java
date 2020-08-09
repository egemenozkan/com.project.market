package com.project.market.model.teztour;

import java.util.List;

public class TezTourData {
	private String date;
	private String day;
	private int night;
	private List<Object> unknown;
	private List<Object> hotelInformations;
	private TezSaleInfo saleInfo;
	private TezFlightCharge flightCharge;
	private AdditionalInformations additionalInformations;

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public int getNight() {
		return night;
	}

	public void setNight(int night) {
		this.night = night;
	}

	public List<Object> getUnknown() {
		return unknown;
	}

	public void setUnknown(List<Object> unknown) {
		this.unknown = unknown;
	}

	public List<Object> getHotelInformations() {
		return hotelInformations;
	}

	public void setHotelInformations(List<Object> hotelInformations) {
		this.hotelInformations = hotelInformations;
	}

	public TezSaleInfo getSaleInfo() {
		return saleInfo;
	}

	public void setSaleInfo(TezSaleInfo saleInfo) {
		this.saleInfo = saleInfo;
	}

	public TezFlightCharge getFlightCharge() {
		return flightCharge;
	}

	public void setFlightCharge(TezFlightCharge flightCharge) {
		this.flightCharge = flightCharge;
	}

	public AdditionalInformations getAdditionalInformations() {
		return additionalInformations;
	}

	public void setAdditionalInformations(AdditionalInformations additionalInformations) {
		this.additionalInformations = additionalInformations;
	}

}