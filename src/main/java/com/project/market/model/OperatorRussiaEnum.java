package com.project.market.model;

public enum OperatorRussiaEnum {

	TEZTOUR(1,"https://www.tez-tour.com/", "tariffsearch/getResult"),
	PEGAS(2,"", ""),
	ANEX(3,"" ,""),
	BIBLIO_GLOBUS(4,"",""),
	TUI(5,"", "");
	
	
	private int id;
	private String website;
	private String searchPath;

	private OperatorRussiaEnum(int id, String website, String searchPath) {
		this.id = id;
		this.website = website;
		this.searchPath = searchPath;
	}

	public int getId() {
		return id;
	}

	public String getWebsite() {
		return website;
	}

	public String getSearchPath() {
		return searchPath;
	}
	
	
}
