package com.infinite.service;

import com.infinite.model.CustomerLogin;
public interface ICustomerService {
	public void addCustomer(CustomerLogin customerLogin);
	public CustomerLogin validateUser(String username, String password);
}
