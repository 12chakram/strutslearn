package com.struts1.sample.form;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.Globals;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

import com.hibernate.pojo.Employee;

public class HelloWorldForm extends ActionForm{
	
	private static final long serialVersionUID = 1L;
	String message;
	String errorMsg;
	List<Employee> empList = new ArrayList<Employee>();
	
	public List<Employee> getEmpList() {
		return empList;
	}

	public void setEmpList(List<Employee> empList) {
		this.empList = empList;
	}

	public HelloWorldForm(){
		clear();
	}
	
	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public String getMessage() {
		return message;
	}
 
	public void setMessage(String message) {
		this.message = message;
	}
	
	@Override
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {
		ActionErrors errors =null;
		if(null==message || "".equals(message)){
			 errors =  new ActionErrors();
			 errors.add("usernameErr", new ActionMessage("helloForm.error"));
			 //request.setAttribute(Globals.ERROR_KEY, errors);
		}
		return errors;
	}
	
	public void clear(){
		this.message = null;
	}
}
