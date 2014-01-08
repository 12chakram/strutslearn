package com.employee.service.impl;

import com.dao.UserManager;
import com.employee.service.UserService;
import com.hibernate.pojo.User;
import com.struts1.sample.form.UserRegisterForm;

public class UserServiceBean implements UserService {

	private UserManager userManager;

	public User doLogin(String userName, String password) {
		
		User existingUser = userManager.getUserByUserNameAndPassword(userName, password);
		
		return existingUser;
	}

	public UserManager getUserManager() {
		return userManager;
	}

	public void setUserManager(UserManager userManager) {
		this.userManager = userManager;
	}

	public User addUser(UserRegisterForm userRegisterForm) {
		return userManager.addUser(userRegisterForm);
	}
	
}


