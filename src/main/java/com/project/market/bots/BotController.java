package com.project.market.bots;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.project.market.model.OperatorRussiaEnum;
import com.project.market.service.IBotService;

@RestController
public class BotController {
	final Logger logger = LoggerFactory.getLogger(BotController.class);

	@Autowired
	Gson gson;
	
	@Autowired
	IBotService botService;
	
	@GetMapping("/")
	public String releaseBot() {
		try {
			testBot();
		} catch (URISyntaxException | IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	private String testBot() throws URISyntaxException, IOException, InterruptedException {
		botService.collectTezTourPrices();
		return null;
	}
}

// https://www.tui.ru/search/?adults=2&dateFrom=1595532122000&directionCountryTo=18803&directionFrom=274286&isEdit=true&maxCost=2000000&nightsFrom=7&nightsTo=14&sortType=5
// curl 'https://apigate.tui.ru/api/tour/search-by-country' -H 'User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10.15; rv:75.0) Gecko/20100101 Firefox/75.0' -H 'Accept: application/json, text/plain, */*' -H 'Accept-Language: en' --compressed -H 'Content-Type: application/json' -H 'X-Requested-With: XMLHttpRequest' -H 'Authorization: Bearer 1ff85c94ad1012e0e0df1caafdc511e3491124b0a019d63c90f048e462e2fea3' -H 'Origin: https://www.tui.ru' -H 'Connection: keep-alive' -H 'Referer: https://www.tui.ru/search/?adults=2&dateFrom=1595532122000&directionCountryTo=18803&directionFrom=274286&isEdit=true&maxCost=2000000&nightsFrom=7&nightsTo=14&sortType=5' -H 'TE: Trailers' --data '{"clientId":"b2c:ru","lang":"ru","currencyId":1,"departureCountryId":210357,"departureCityId":274286,"arrivalCountryId":18803,"arrivalRegionIds":[],"arrivalCityIds":[],"adults":2,"children":[],"minStartDate":"2020-07-23","maxStartDate":"2020-07-23","minNightsCount":7,"maxNightsCount":14,"hotelIds":[]}' 


//https://www.anextour.com/tours/turkey?ADULT=2&CHILD=0&CURRENCY=1&NIGHTS_FROM=5&NIGHTS_TILL=12&PARTITION_PRICE=40&TOWNFROMINC=2&COSTMAX=&COSTMIN=&FILTER=6&PRICE_PAGE=1&RECONPAGE=400&UFILTER=0&REGULAR=True&CHARTER=True&SORT_TYPE=0&REGIONTO=&CHECKIN_BEG=20200723&CHECKIN_END=20200723&STATEINC=3
//https://webapisearch.anextour.com/b2c/Search?ADULT=2&CHECKIN_BEG=20200723&CHECKIN_END=20200723&CHILD=0&NIGHTMAX=12&NIGHTMIN=5&STATE=3&CURRENCY=1&PARTITION_PRICE=40&COSTMAX=&COSTMIN=&FILTER=6&PRICE_PAGE=1&RECONPAGE=400&UFILTER=0&REGULAR=True&CHARTER=True&SORT_TYPE=1&REGIONTO=&TOWNFROM=2


// https://pegast.ru/hotels/search?from=76&startDate=2020-08-21&endDate=2020-08-28&countries=%5B73%5D
//https://pegast.ru/_internal/hotels/tours?departure_location_id=76&adults=2&infants=0&children=0&start_date=20-08-21&end_date=20-08-28&country_ids%5B%5D=73&page=1

//https://www.bgoperator.ru/?data=16.07.2020&f7=7&flt=100411293179&flt2=100510000863&p=0050419840.0050419840&rx=0
//https://www.bgoperator.ru/site?xml=31&action=price&id_price=-1&F4=102610158372&F4=102626240984&F4=102610136560&F4=102610149896&F4=102610088859&F4=102616545308&F4=102610109089&F4=102610124457&F4=102625162059&F4=102625805332&F4=102616137038&F4=102610156701&F4=102625075966&F4=102625109689&F4=102625264823&F4=102625746958&F4=102616069171&F4=102610145610&F4=102625076462&F4=102625470455&F4=102625732203&F4=102626042191&F4=102610079005&F4=102610162825&F4=102625076452&F4=102625746954&F4=102617018105&F4=102610088167&F4=102610122498&F4=102616052412&F4=102610087425&F4=102610146473&F4=102610149450&F4=102610168056&F4=102625076034&F4=102625076464&F4=102625251317&F4=102625846719&F4=102625897138&F4=102610128215&F4=102610149854&F4=102610158832&F4=102625076456&F4=102626197384&F4=102626216561&F4=102616056005&F4=102610151679&F4=102625076058&F4=102625217736&F4=102625700309&F4=102610085221&F4=102610146878&F4=102610165166&F4=102625076472&F4=102625203178&F4=102625935892&F4=102616542308&F4=102618296282&F4=102610125901&F4=102610148492&F4=102610162007&F4=102610165162&F4=102610165164&F4=102625076044&F4=102625076520&F4=102625610259&F4=102616077346&F4=102616524582&F4=102610001045&F4=102610137956&F4=102610147899&F4=102610154751&F4=102610167102&F4=102625076040&F4=102626047232&F4=102626243919&F4=102616526345&F4=102616602263&F4=102616607194&F4=102610083838&entr=-100&data=16.07.2020&f7=7&flt=100411293179&&p=0050419840.0050419840