package com.infinite.repository;

import com.infinite.model.AdminLogin;

public interface IAdminDao {
	public AdminLogin validateUser(String username,String password);
}
