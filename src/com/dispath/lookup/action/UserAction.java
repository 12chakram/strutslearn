/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dispath.lookup.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.actions.LookupDispatchAction;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForward;

import com.dispath.lookup.Form.UserForm;

import java.util.*;

public class UserAction extends LookupDispatchAction {
    
    /* forward name="success" path="" */
    private final static String SUCCESS = "success";
    
    /** Provides the mapping from resource key to method name.
     * @return Resource key / method name map.
     */
    protected Map<String, String> getKeyMethodMap() {
      Map<String, String> map = new HashMap<String, String>();
      map.put("UserForm.add", "add");
      map.put("UserForm.update", "update");
      map.put("UserForm.delete", "delete");
      return map;
    }
    
   public ActionForward add(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        UserForm userForm = (UserForm) form;
        userForm.setMessage("Inside add user method.");
        return mapping.findForward(SUCCESS);
    }

    public ActionForward update(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        UserForm userForm = (UserForm) form;
        userForm.setMessage("Inside update user method.");
        return mapping.findForward(SUCCESS);
    }

    public ActionForward delete(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        UserForm userForm = (UserForm) form;
        userForm.setMessage("Inside delete user method.");
        return mapping.findForward(SUCCESS);
    }
   
}