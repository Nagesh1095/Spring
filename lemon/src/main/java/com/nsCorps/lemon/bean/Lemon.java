package com.nsCorps.lemon.bean;

import java.util.ArrayList;
import java.util.Map;
import java.util.Properties;

import lombok.Data;

@Data
public class Lemon {

	private String manthravadiName;
	private String Location;
	int[] dates;
	ArrayList<String> manthravaadiGalu;
	Map<String, String> magicians;
	Properties mantravaadis;

	public void mataManthra() {
		System.out.println(manthravadiName + " is famous for maatamantra");
		System.out.println("available mantravaadi's are " + manthravaadiGalu);
		System.out.println("available mantravaadigalu with avrgala address");
		System.out.println(magicians);
		System.out.println(mantravaadis);
	}

}
