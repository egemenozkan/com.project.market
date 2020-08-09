package com.project.market.service;

import java.util.List;

import com.project.market.model.CrawlerPriceModel;

public interface IBotService {
		
	public List<CrawlerPriceModel> collectTezTourPrices();
}
