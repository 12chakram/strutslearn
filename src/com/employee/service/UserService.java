package com.employee.service;

import com.hibernate.pojo.User;
import com.struts1.sample.form.UserRegisterForm;

public interface UserService {
	
	public User doLogin(String userName,String password);
	
	public User addUser(UserRegisterForm userRegisterForm);

}
