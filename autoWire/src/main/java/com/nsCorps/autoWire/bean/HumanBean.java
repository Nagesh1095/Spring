package com.nsCorps.autoWire.bean;

import lombok.Data;

@Data
public class HumanBean {
	
	private String name;
	private double weight;
	
	private HeartBean heart;
	
	public HumanBean() {
		System.out.println("Human always selfish");
	}
	
	public HumanBean(String name , double weight, HeartBean heart){
		this.name=name;
		this.weight=weight;
		this.heart=heart;
		
		System.out.println("the name of human is "+name+" with a weight of "+weight);
	}

}
