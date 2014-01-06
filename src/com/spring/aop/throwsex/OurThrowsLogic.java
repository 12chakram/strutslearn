package com.spring.aop.throwsex;

import com.spring.context.ApplicationContextBean;

public class OurThrowsLogic {
	public static void main(String[] args) {
		MyThrowsInterface a = (MyThrowsInterface) ApplicationContextBean.getContext().getBean("throwsInter");
		a.m1();
	}
}
