
package com.nsCorps.di.bean;

import lombok.Data;

@Data
public class TreeBean {

	private String name;
	private int noOfBranches;

	private RootBean root;

	public void provideFruits() {
		System.out.println("Provide fruits.......");
		System.out.println("The tree " + name + " with " + noOfBranches + " Branches.");
	}

}
