package com.infinite.service;

import com.infinite.model.AdminLogin;

public interface IAdminService {
	public AdminLogin validateUser(String username,String password);

}
