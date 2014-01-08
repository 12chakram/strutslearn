package com.dao;

import com.hibernate.pojo.User;

public interface UserManager {
	
	public User getUserByUserNameAndPassword(String userNAme,String password);

}
