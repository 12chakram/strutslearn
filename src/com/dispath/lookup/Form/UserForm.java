/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dispath.lookup.Form;

import org.apache.struts.action.ActionForm;

public class UserForm extends ActionForm {

	private static final long serialVersionUID = 1L;
	private String message;
    
        public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


}
