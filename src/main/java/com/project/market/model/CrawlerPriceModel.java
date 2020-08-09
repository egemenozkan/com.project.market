package com.project.market.model;

public class CrawlerPriceModel {
	private String hotel;
	private String hotelCode;
	private OperatorRussiaEnum operator;

	public String getHotel() {
		return hotel;
	}

	public void setHotel(String hotel) {
		this.hotel = hotel;
	}

	public String getHotelCode() {
		return hotelCode;
	}

	public void setHotelCode(String hotelCode) {
		this.hotelCode = hotelCode;
	}

	public OperatorRussiaEnum getOperator() {
		return operator;
	}

	public void setOperator(OperatorRussiaEnum operator) {
		this.operator = operator;
	}

}
