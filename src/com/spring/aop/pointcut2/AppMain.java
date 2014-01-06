package com.spring.aop.pointcut2;

import com.spring.context.ApplicationContextBean;

public class AppMain {
	public static void main(String[] args) {
 
		CustomerService cust = (CustomerService) ApplicationContextBean.getContext().getBean("customerServiceProxy");
 
		System.out.println("*************************");
		cust.printName();
		System.out.println("*************************");
		cust.printURL();
		System.out.println("*************************");
		try {
			cust.printThrowException();
		} catch (Exception e) {
		}
	}
}
