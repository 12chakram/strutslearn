package com.spring.context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class ApplicationContextBean {
	public static ApplicationContext context;
	
	public static ApplicationContext getContext(){
		if(context==null)
			context = new ClassPathXmlApplicationContext("springContext.xml");
		return context;
	}

}
