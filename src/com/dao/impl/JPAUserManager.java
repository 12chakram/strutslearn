package com.dao.impl;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import cg.hibernate.util.HibernateUtil;

import com.dao.UserManager;
import com.hibernate.pojo.User;

public class JPAUserManager implements UserManager {

	public User getUserByUserNameAndPassword(String userName, String password) {
		
		SessionFactory factory =  HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Query query = session.createQuery("FROM User user WHERE userName='"+userName+"'AND password='"+password+"'");
		User existingUser = (User) query.uniqueResult();
		return existingUser;
	}

}
