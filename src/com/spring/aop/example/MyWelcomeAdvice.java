package com.spring.aop.example;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class MyWelcomeAdvice implements MethodBeforeAdvice {

	public void before(Method arg0, Object[] arg1, Object arg2)
			throws Throwable {
		System.out.println("Am from BeforeAdvice to :"+arg0.getName());

	}

}
