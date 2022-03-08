package com.nsCorps.spring.runner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nsCorps.spring.bean.SeasonBean;

public class RunnerClass {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		SeasonBean bean = context.getBean("bean", SeasonBean.class);
		System.out.println("bean ref..." + bean);
		SeasonBean bean1 = context.getBean("bean", SeasonBean.class);
		System.out.println("bean ref..." + bean1);

//		
//		bean.provideClimate();
//		
//		System.out.println(bean.getSeasonName());

	}

}
