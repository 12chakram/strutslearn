package com.struts1.sample;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.LookupDispatchAction;

import com.struts1.sample.form.DispatchForm;

public class DispatchActionSample extends LookupDispatchAction{

	private final static String SUCCESS = "success";
	
	@Override
	protected Map getKeyMethodMap() {
		Map map = new HashMap();
	      map.put("dispatchForm.add", "add");
	      map.put("dispatchForm.update", "update");
	      map.put("dispatchForm.delete", "delete");
		return map;
	}
	
	   public ActionForward add(ActionMapping mapping, ActionForm form,
	            HttpServletRequest request, HttpServletResponse response)
	            throws Exception {
		   DispatchForm dispatchForm = (DispatchForm) form;
	        dispatchForm.setMessage("Inside add user method.");
	        return mapping.findForward(SUCCESS);
	    }

	    public ActionForward update(ActionMapping mapping, ActionForm form,
	            HttpServletRequest request, HttpServletResponse response)
	            throws Exception {
	    	DispatchForm dispatchForm = (DispatchForm) form;
	        dispatchForm.setMessage("Inside update user method.");
	        return mapping.findForward(SUCCESS);
	    }

	    public ActionForward delete(ActionMapping mapping, ActionForm form,
	            HttpServletRequest request, HttpServletResponse response)
	            throws Exception {
	    	DispatchForm dispatchForm = (DispatchForm) form;
	        dispatchForm.setMessage("Inside delete user method.");
	        return mapping.findForward(SUCCESS);
	    }

}
