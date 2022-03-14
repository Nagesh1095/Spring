package com.nsCorps.autoWire.runner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nsCorps.autoWire.bean.HumanBean;
import com.nsCorps.autoWire.bean.LaptopBean;

public class RunnerClass {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
//		HumanBean humanbean = context.getBean(HumanBean.class);
		
		LaptopBean laptopBean = context.getBean(LaptopBean.class);
	}

}
