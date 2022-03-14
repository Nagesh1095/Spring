package com.nsCorps.di.bean;

import lombok.Data;

@Data
public class RootBean {

	private String typeOfSoil;

	public RootBean() {

	}

	public RootBean(String typeOfSoil) {
		System.out.println("The type of soil is "+typeOfSoil);
	}

	public void absorbNutrients() {
		System.out.println("it absorb nutrients to stability to tree");
	}
}
