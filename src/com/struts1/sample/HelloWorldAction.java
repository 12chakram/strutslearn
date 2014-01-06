package com.struts1.sample;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.Globals;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.employee.service.factory.EmployeeServiceFactory;
import com.spring.context.ApplicationContextBean;
import com.struts1.sample.form.HelloWorldForm;

public class HelloWorldAction extends Action{
	
	public ActionForward execute(ActionMapping mapping,ActionForm form,
			HttpServletRequest request,HttpServletResponse response)
	        throws Exception {
			String forward = "success";
			ApplicationContext context;
			/*String x = null;
		      x = x.substring(0);*/
			HelloWorldForm helloWorldForm = (HelloWorldForm) form;
			System.out.println("Name : "+helloWorldForm.getMessage());
			System.out.println("Locale: "+request.getSession().getAttribute(Globals.LOCALE_KEY));
			/*context = (ApplicationContext) request.getSession().getServletContext();
			Employee employee = (Employee) context.getBean("employee");
			System.out.println("emp: "+employee);*/
			context = ApplicationContextBean.getContext();
			/*	Internationalization
			 * System.out.println("Locale 1: "+request.getSession().getAttribute(Globals.LOCALE_KEY));
			request.getSession().setAttribute(Globals.LOCALE_KEY, Locale.FRANCE);
			System.out.println("Locale 2: "+request.getSession().getAttribute(Globals.LOCALE_KEY));*/
			EmployeeServiceFactory empService = (EmployeeServiceFactory) context.getBean("empServiceFactory");
			System.out.println("TxtMsg; "+empService.getTextMessage());
			helloWorldForm.setEmpList(empService.geEmployeeService().getEmployeeDetails());
			return mapping.findForward(forward);
			
		}

}
