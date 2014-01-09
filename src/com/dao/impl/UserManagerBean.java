package com.dao.impl;


import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import cg.hibernate.util.HibernateUtil;

import com.dao.UserManager;
import com.hibernate.pojo.User;
import com.struts1.sample.form.UserRegisterForm;

public class UserManagerBean implements UserManager {
	
	SessionFactory factory;
	Session session;

	public User getUserByUserNameAndPassword(String userName, String password) {
		
		 factory =  HibernateUtil.getSessionFactory();
		 session = factory.openSession();
		Query query = session.createQuery("FROM User user WHERE userName='"+userName+"'AND password='"+password+"'");
		User existingUser = (User) query.uniqueResult();
		return existingUser;
	}

	public User addUser(UserRegisterForm userRegisterForm) {
	
		 factory =  HibernateUtil.getSessionFactory();
		 session = factory.openSession();
		 
		 User user = new User();
		 
		 user.setUserName(userRegisterForm.getUserName());
		 user.setFirstName(userRegisterForm.getFirstName());
		 user.setLastName(userRegisterForm.getLastName());
		 user.setEmail(userRegisterForm.getEmail());
		 user.setPassword(userRegisterForm.getPassword());
		 user.setMobile(userRegisterForm.getPhone());
		 
		 try{
			 Transaction transaction = session.beginTransaction();
			 session.save(user);
			 transaction.commit();
			 user = getUserByUserNameAndPassword(user.getUserName(),user.getPassword());
		 }catch(Exception exception){
			user.setMessage(exception.getLocalizedMessage());
		 }
		return user;
	}

}
