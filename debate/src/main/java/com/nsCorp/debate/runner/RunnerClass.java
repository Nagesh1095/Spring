package com.nsCorp.debate.runner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nsCorp.debate.bean.DebateBean;

public class RunnerClass {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		DebateBean debateBean = context.getBean("bean" ,DebateBean.class);
		debateBean.Speech();
		
	}

}
