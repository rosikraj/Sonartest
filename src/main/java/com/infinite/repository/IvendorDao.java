package com.infinite.repository;

import com.infinite.model.VendorLogin;

public interface IvendorDao {
	
	public VendorLogin addVendor(VendorLogin vendorLogin);
	public VendorLogin validateuser(String username, String password);
}