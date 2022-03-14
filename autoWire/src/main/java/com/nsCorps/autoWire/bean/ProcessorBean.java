package com.nsCorps.autoWire.bean;

import lombok.Data;

@Data
public class ProcessorBean {
	
	private String cpuCompany;
	private String model;
	
	public ProcessorBean() {
		System.out.println("Processor is functional...");
	}

	public ProcessorBean(String cpuCompany, String model) {
		this.cpuCompany = cpuCompany;
		this.model = model;
		
		System.out.println("The "+cpuCompany+" processor of "+model+" Model");
	}

}
