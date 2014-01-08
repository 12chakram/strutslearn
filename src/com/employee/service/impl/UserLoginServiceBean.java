package com.employee.service.impl;

import com.dao.UserManager;
import com.employee.service.UserLoginService;
import com.hibernate.pojo.User;

public class UserLoginServiceBean implements UserLoginService {

	private UserManager jpaUserManager;

	public User doLogin(String userName, String password) {
		
		User existingUser = jpaUserManager.getUserByUserNameAndPassword(userName, password);
		
		return existingUser;
	}
	
	
	public UserManager getJpaUserManager() {
		return jpaUserManager;
	}

	public void setJpaUserManager(UserManager jpaUserManager) {
		this.jpaUserManager = jpaUserManager;
	}

}


