package com.spring.aop.pointcut;

import java.util.Arrays;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class BusinessAdvice implements MethodInterceptor{

	public Object invoke(MethodInvocation method) throws Throwable {
		System.out.println("Method name : " + method.getMethod().getName());
        System.out.println("Method arguments : " + Arrays.toString(method.getArguments()));
  
        System.out.println("Around method is called");
        System.out.println("Around before is running");
  
        method.proceed();
        
		return null;
	}

}
