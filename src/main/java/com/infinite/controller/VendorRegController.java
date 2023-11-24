package com.infinite.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.infinite.model.VendorLogin;
import com.infinite.service.IVendorService;

@RestController
@CrossOrigin("http://localhost:3000/")
public class VendorRegController {
	@Autowired
	IVendorService vserviceimpl;
	@RequestMapping(value = "/vregister", method = RequestMethod.POST, headers = "Accept=application/json")
	public ResponseEntity<String> addVendor(@RequestBody VendorLogin vendorLogin) {
		try {
			vserviceimpl.addVendor(vendorLogin);
            return ResponseEntity.ok("Registration successful");

		}
		catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Registration failed");
        }
	}
	
	@RequestMapping(value="/vlogin")
	public ResponseEntity<String> loginvendor(@RequestBody VendorLogin login) {
        String fname = login.getFname();
        String vpassword = login.getVPassword();
 
        VendorLogin validateuser = vserviceimpl.validateUser(fname, vpassword);
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