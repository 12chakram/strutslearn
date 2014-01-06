package com.employee.service.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import cg.hibernate.util.HibernateUtil;

import com.employee.service.EmployeeService;
import com.hibernate.pojo.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	public List<Employee> getEmployeeDetails() {
		SessionFactory factory =  HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Query query = session.createQuery("FROM Employee");
		List<Employee> empList = query.list();
		
		return empList;
	}

}
