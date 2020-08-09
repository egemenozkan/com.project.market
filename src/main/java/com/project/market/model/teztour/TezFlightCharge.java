package com.project.market.model.teztour;

import java.math.BigDecimal;

public class TezFlightCharge {
	TezFlight to;
	TezFlight from;
	BigDecimal price;

	public TezFlight getTo() {
		return to;
	}

	public TezFlight getFrom() {
		return from;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setTo(TezFlight to) {
		this.to = to;
	}

	public void setFrom(TezFlight from) {
		this.from = from;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

}