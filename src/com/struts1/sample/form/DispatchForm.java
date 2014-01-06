package com.struts1.sample.form;

import org.apache.struts.action.ActionForm;

public class DispatchForm extends ActionForm{

	private static final long serialVersionUID = 1L;
	private String message;
	
	public DispatchForm(){
		
	}
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public void clear(){
		this.message = null;
	}
}
