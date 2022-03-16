package com.nsCorps.springAnnotation.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class WaterBean {

	private boolean isTransperent;

	private String color;

	private double phLevel;
	
	@Autowired
	private FishBean fishBean;

	public void flow() {

	}
	
	public WaterBean(@Value("true") boolean isTransperent, @Value("No Color") String color,
			@Value("7.2") double phLevel, FishBean fishBean) {
		this.isTransperent = isTransperent;
		this.color = color;
		this.phLevel = phLevel;
		this.fishBean = fishBean;
		System.out.println("The water is Transperent " + isTransperent + " with " + color + " and the phLevel is "
				+ phLevel + " and " + fishBean);
	}

}
