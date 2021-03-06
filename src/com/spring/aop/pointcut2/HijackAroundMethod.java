package com.spring.aop.pointcut2;

import java.util.Arrays;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class HijackAroundMethod implements MethodInterceptor{
	public Object invoke(MethodInvocation methodInvocation) throws Throwable {
		 
		System.out.println("Method name : "
				+ methodInvocation.getMethod().getName());
		System.out.println("Method arguments : "
				+ Arrays.toString(methodInvocation.getArguments()));
 
		System.out.println("HijackAroundMethod : Before method hijacked!");
 
		try {
			Object result = methodInvocation.proceed();
			System.out.println("HijackAroundMethod : Before after hijacked!");
 
			return result;
 
		} catch (IllegalArgumentException e) {
 
			System.out.println("HijackAroundMethod : Throw exception hijacked!");
			throw e;
		}
	}
}
