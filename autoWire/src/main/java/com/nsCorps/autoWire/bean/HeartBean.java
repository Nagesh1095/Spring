package com.nsCorps.autoWire.bean;

import lombok.Data;

@Data
public class HeartBean {

	private byte noOfChambers;
		private int noOfCountPerDay;
		
		public HeartBean() {
			System.out.println("Heart is to pumping the Blood");
		}
		
		public HeartBean(byte noOfChambers , int noOfCountPerDay) {
			this.noOfChambers=noOfChambers;
			this.noOfCountPerDay = noOfCountPerDay;
			
			System.out.println("The Heart consist of "+noOfChambers+" chambers and It beats upto "+noOfCountPerDay);
		}

	}


