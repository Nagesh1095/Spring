package com.nsCorps.springAnnotation.runner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nsCorps.springAnnotation.bean.FishBean;
import com.nsCorps.springAnnotation.bean.WaterBean;

public class RunnerClass {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		WaterBean bean = context.getBean(WaterBean.class);
			
//		FishBean fishBean = new FishBean("Shark",136);
		
		
	}

}
