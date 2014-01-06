package com.spring.aop.pointcut;

import java.lang.reflect.Method;

import org.springframework.aop.support.StaticMethodMatcherPointcut;

public class SimpleStaticPointcut extends StaticMethodMatcherPointcut{

	public boolean matches(Method method, Class arg1) {
		return ("doSomeThing".equals(method.getName()));
	}

}
