package com.nsCorps.di.runner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nsCorps.di.bean.TreeBean;

public class RunnerClass {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		TreeBean bean = context.getBean(TreeBean.class);
	}

}
