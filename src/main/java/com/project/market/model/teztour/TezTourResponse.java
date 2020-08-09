package com.project.market.model.teztour;

import java.util.ArrayList;

public class TezTourResponse {
	private boolean success;
	private String serverName;
	private ArrayList<Object> data;
	private ArrayList<Object> info;
	private float scalePrice;
	private float departureCityId;
	private float arrivalCountryId;

	// Getter Methods

	public boolean getSuccess() {
		return success;
	}

	public String getServerName() {
		return serverName;
	}

	public float getScalePrice() {
		return scalePrice;
	}

	public float getDepartureCityId() {
		return departureCityId;
	}

	public float getArrivalCountryId() {
		return arrivalCountryId;
	}

	// Setter Methods

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public void setServerName(String serverName) {
		this.serverName = serverName;
	}

	public void setScalePrice(float scalePrice) {
		this.scalePrice = scalePrice;
	}

	public void setDepartureCityId(float departureCityId) {
		this.departureCityId = departureCityId;
	}

	public void setArrivalCountryId(float arrivalCountryId) {
		this.arrivalCountryId = arrivalCountryId;
	}

	public ArrayList<Object> getData() {
		return data;
	}

	public void setData(ArrayList<Object> data) {
		this.data = data;
	}

	public ArrayList<Object> getInfo() {
		return info;
	}

	public void setInfo(ArrayList<Object> info) {
		this.info = info;
	}
}