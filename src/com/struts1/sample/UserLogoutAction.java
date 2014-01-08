package com.struts1.sample;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.struts1.sample.form.LoginForm;


public class UserLogoutAction extends Action  {
	
	HttpSession session;
	
	public ActionForward execute(ActionMapping mapping,ActionForm form,
			HttpServletRequest request,HttpServletResponse response)throws Exception {
		
		String forward = "success";
		
		session = request.getSession(true);
		LoginForm loginForm = null;
		session.invalidate();
		return mapping.findForward(forward);
	}

}
