package com.nsCorps.spring.bean;

public class SeasonBean {

	private String SeasonName;
	
	
	public String getSeasonName() {
		return SeasonName;
	}


	public void setSeasonName(String seasonName) {
		SeasonName = seasonName;
	}

	public SeasonBean() {
		
	}
	
	public void provideClimate() {
		System.out.println("Weather Not Supported");
	}
		
}
