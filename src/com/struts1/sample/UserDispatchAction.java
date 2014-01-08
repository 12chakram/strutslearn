package com.struts1.sample;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.LookupDispatchAction;
import org.springframework.context.ApplicationContext;

import com.employee.service.impl.UserServiceBean;
import com.hibernate.pojo.User;
import com.spring.context.ApplicationContextBean;
import com.struts1.sample.form.UserRegisterForm;


public class UserDispatchAction extends LookupDispatchAction {

	ApplicationContext context;
	@Override
	protected Map<String, String> getKeyMethodMap() {
		Map<String, String> map = new HashMap<String, String>();
	      map.put("userRegisterForm.add","add");
		return map;
	}
	
	  public ActionForward add(ActionMapping mapping, ActionForm form,
	            HttpServletRequest request, HttpServletResponse response)
	            throws Exception {
		   UserRegisterForm userRegisterForm = (UserRegisterForm) form;
		   String forward;
		   
		    context = ApplicationContextBean.getContext();
		    UserServiceBean userService = (UserServiceBean) context.getBean("userService");
		    
		    User createdUser = userService.addUser(userRegisterForm);
		    if(createdUser!=null &&  createdUser.getId()!=null){
		    	  forward = "success";
		    }else{
		    	forward = "error";
		    }
	        return mapping.findForward(forward);
	    }

}
