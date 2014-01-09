package com.struts1.sample.form;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import com.hibernate.pojo.Employee;

public class LoginForm extends ActionForm{
	
	private static final long serialVersionUID = 1L;
	
	String errorMsg;
	
	String userName;
	String password;
	String email;
	String phone;
	
	List<Employee> empList = new ArrayList<Employee>();
	
	public List<Employee> getEmpList() {
		return empList;
	}

	public void setEmpList(List<Employee> empList) {
		this.empList = empList;
	}

	public LoginForm(){
		clear();
	}
	
	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public ActionErrors validate(ActionMapping mapping,HttpServletRequest request) {
		ActionErrors errors = new ActionErrors();
		if (StringUtils.isBlank(userName) || userName.length() < 1) {
		 errors.add("userName", new ActionMessage("error.userName.required"));
		}
		if (StringUtils.isBlank(password)) {
	       errors.add("password", new ActionMessage("error.password.required"));
		}
	   return errors;
	}
	
	public void clear(){
		this.userName = null;
		this.password = null;
		this.email =null;
		this.phone = null;
		
	}
}
