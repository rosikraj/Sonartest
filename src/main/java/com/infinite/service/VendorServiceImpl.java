package com.infinite.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infinite.model.VendorLogin;
import com.infinite.repository.IvendorDao;

@Service
public class VendorServiceImpl implements IVendorService {

	@Autowired
	IvendorDao vdaoimpl;
	
	@Transactional
	public void addVendor(VendorLogin vendorLogin) {
		// TODO Auto-generated method stub
		vdaoimpl.addVendor(vendorLogin);
	}

	@Transactional
	public VendorLogin validateUser(String username, String password) {
		// TODO Auto-generated method stub
		return vdaoimpl.validateuser(username, password);
	}

}
