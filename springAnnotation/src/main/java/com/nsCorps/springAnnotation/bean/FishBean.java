package com.nsCorps.springAnnotation.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
//@Component
public class FishBean {
//	@Value("Shark")
	private String name;
//	@Value("136")
	private int weight;

	public FishBean(@Value("Shark") String name, @Value("136") int weight) {
		this.name = name;
		this.weight = weight;

		System.out.println("The Fish " + name + " with " + weight + " KGs.");
	}

//	@Autowired
//	public FishBean(WaterBean waterBean) {
//		System.out.println(waterBean);
//	}

}
