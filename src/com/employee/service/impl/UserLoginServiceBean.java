package com.employee.service.impl;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import cg.hibernate.util.HibernateUtil;

import com.employee.service.UserLoginService;
import com.hibernate.pojo.User;

public class UserLoginServiceBean implements UserLoginService {

	public User doLogin(String userName, String password) {
		
		SessionFactory factory =  HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Query query = session.createQuery("FROM USER WHERE USERNAME="+userName+"AND PASSWORD="+password);
		User existingUser = (User) query.uniqueResult();
		return existingUser;
	}

}


