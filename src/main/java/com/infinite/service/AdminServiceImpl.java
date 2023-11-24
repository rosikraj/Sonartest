package com.infinite.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.infinite.model.AdminLogin;
import com.infinite.repository.IAdminDao;
@Service
public class AdminServiceImpl implements IAdminService{
	@Autowired
	IAdminDao adaoimpl;

	@Transactional
	public AdminLogin validateUser(String username, String password) {
		// TODO Auto-generated method stub
		return adaoimpl.validateUser(username, password);
	}

}
