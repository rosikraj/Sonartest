package com.infinite.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.infinite.model.CustomerLogin;
import com.infinite.service.ICustomerService;

@RestController
@CrossOrigin("http://localhost:3000/")
public class RegisterController {
	@Autowired
	ICustomerService cserviceimpl;

	
	@RequestMapping(value = "/register", method = RequestMethod.POST, headers = "Accept=application/json")
	public ResponseEntity<String> addCustomer(@RequestBody CustomerLogin customerLogin) {
		try {
			cserviceimpl.addCustomer(customerLogin);
            return ResponseEntity.ok("Registration successful");

		}
		catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Registration failed");
        }
	}
	
	@RequestMapping(value="/login",method = RequestMethod.POST, headers = "Accept=application/json")
	public ResponseEntity<String> loginUser(@RequestBody CustomerLogin login) {
        String username = login.getUsername();
        String password = login.getPassword();
 
        CustomerLogin validateuser = cserviceimpl.validateUser(username, password);
        if(validateuser!=null) {
        	//returns status code 200
        	return ResponseEntity.ok("Login successfull");
        }
        else {
        	//returns status code 401 unauthorized
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("invalid credintials");

        }
       
	}


}
