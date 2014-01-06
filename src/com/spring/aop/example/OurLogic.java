package com.spring.aop.example;

import com.spring.context.ApplicationContextBean;

public class OurLogic {

	public static void main(String[] args) {
		MyInterFaceEx interFaceEx =	(MyInterFaceEx) ApplicationContextBean.getContext().getBean("id4");
		interFaceEx.m1();
		interFaceEx.m2();
	}

}
