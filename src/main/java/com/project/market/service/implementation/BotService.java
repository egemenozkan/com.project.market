package com.project.market.service.implementation;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.project.market.model.CrawlerPriceModel;
import com.project.market.model.OperatorRussiaEnum;
import com.project.market.model.teztour.AdditionalInformations;
import com.project.market.model.teztour.TezFlightCharge;
import com.project.market.model.teztour.TezSaleInfo;
import com.project.market.model.teztour.TezTourData;
import com.project.market.model.teztour.TezTourResponse;
import com.project.market.service.IBotService;

@Service
public class BotService implements IBotService {
	final Logger logger = LoggerFactory.getLogger(BotService.class);

	@Autowired
	Gson gson;

	@Override
	public List<CrawlerPriceModel> collectTezTourPrices() {
		HttpClient client = HttpClient.newHttpClient();
		// https://www.tez-tour.com/search.html
		String url = "https://www.tez-tour.com/tariffsearch/getResult?&_=1587917724574&locale=en&cityId=345&countryId=1104&after=10.07.2020&before=17.07.2020&nightsMin=6&nightsMax=14&hotelClassId=269506&hotelClassBetter=true&rAndBId=15350&rAndBBetter=true&accommodationId=2&children=0&hotelInStop=false&specialInStop=false&noTicketsTo=false&noTicketsFrom=false&tourType=1&version=2&searchTypeId=3&priceMin=0&priceMax=1500000&currency=18864&birthdays=&contentCountryId=1102";
		try {

			StringBuilder sourceUrlStrBuilder = new StringBuilder(OperatorRussiaEnum.TEZTOUR.getWebsite());
			sourceUrlStrBuilder.append(OperatorRussiaEnum.TEZTOUR.getSearchPath());
			HttpRequest request = HttpRequest.newBuilder().uri(new URI(url)).build();

			HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
			TezTourResponse tezTourResponse = gson.fromJson(response.body(), TezTourResponse.class);
			if (tezTourResponse != null) {
				for (int i = 0; i < tezTourResponse.getData().size(); i++) {
					ArrayList<Object> data = (ArrayList<Object>) tezTourResponse.getData().get(i);
					logger.error("rawdata {}", gson.toJson(data));

					TezTourData tezTourData = new TezTourData();
					tezTourData.setDate(data.get(0).toString());
					tezTourData.setDay(data.get(2).toString());
					tezTourData.setNight(Double.valueOf(data.get(3).toString()).intValue());
					//4
					tezTourData.setUnknown((ArrayList<Object>)data.get(5));
					tezTourData.setHotelInformations((ArrayList<Object>)data.get(6));
//7
					tezTourData.setSaleInfo(gson.fromJson(data.get(10).toString(), TezSaleInfo.class));
					tezTourData.setFlightCharge(gson.fromJson((((ArrayList<Object>)data.get(13)).get(0)).toString(), TezFlightCharge.class));
					tezTourData.setAdditionalInformations(gson.fromJson(data.get(14).toString(), AdditionalInformations.class));
					logger.error("response {}", gson.toJson(tezTourData));

				}
			}

		} catch (Exception e) {
			logger.error("{}",e);
		}

		return null;
	}

}
