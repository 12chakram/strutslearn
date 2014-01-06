package com.spring.aop.throwsex;

public class MyImplClass implements MyThrowsInterface {

	@SuppressWarnings("unused")
	public void m1() {
		int java4s = 10/0;
		System.out.println("Am in business method..");
		
	}

}
