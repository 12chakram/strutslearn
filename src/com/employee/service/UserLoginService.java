package com.employee.service;

import com.hibernate.pojo.User;

public interface UserLoginService {
	
	public User doLogin(String userName,String password);

}
