package com.spring.aop.pointcut;

import com.spring.context.ApplicationContextBean;

public class StaticPoincutMain {

	public static void main(String[] args) {
		BusinessImpl businessImpl = (BusinessImpl)ApplicationContextBean.getContext().getBean("staticProxyFactory");
		businessImpl.doSomeThing();
	}

}
