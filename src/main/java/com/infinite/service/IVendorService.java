package com.infinite.service;

import com.infinite.model.VendorLogin;

public interface IVendorService {
	public void addVendor(VendorLogin vendorLogin);
	public VendorLogin validateUser(String username, String password);
}
