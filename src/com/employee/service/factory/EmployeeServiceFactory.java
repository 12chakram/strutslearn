package com.employee.service.factory;

import com.employee.service.EmployeeService;

public class EmployeeServiceFactory {
	private EmployeeService employeeService;
	private String textMessage;
	
	public void setEmployeeService(EmployeeService empImpl){
		this.employeeService = empImpl;
	}
	public EmployeeService geEmployeeService(){
		return employeeService;
	}
	public String getTextMessage() {
		return textMessage;
	}
	public void setTextMessage(String textMessage) {
		this.textMessage = textMessage;
	}
	
	
}
