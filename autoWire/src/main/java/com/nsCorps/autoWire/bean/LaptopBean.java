package com.nsCorps.autoWire.bean;

import lombok.Data;

@Data
public class LaptopBean {

	private String brand;
	private String model;
	private int price;

	private ProcessorBean processor;

	public LaptopBean() {
	}

	public LaptopBean(String brand, String model, int price, ProcessorBean processorBean) {
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.processor = processorBean;
		
		System.out.println("The Laptop of "+brand+" brand and the Model is "+model+" of "+price+" Rupees only");
	}

}
