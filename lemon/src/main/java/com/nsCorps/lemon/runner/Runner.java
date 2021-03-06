package com.nsCorps.lemon.runner;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nsCorps.lemon.bean.Lemon;

public class Runner {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		Lemon lemon = context.getBean("bean", Lemon.class);
		lemon.mataManthra();
		System.out.println(Arrays.toString(lemon.getDates()));
	}

}
