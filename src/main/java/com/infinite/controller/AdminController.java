package com.infinite.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infinite.model.AdminLogin;
import com.infinite.service.IAdminService;


@RestController
@CrossOrigin("http://localhost:3000/")
public class AdminController {
	@Autowired
	IAdminService aserviceimpl;
	@RequestMapping(value="/alogin")
	public ResponseEntity<String> adminlogin(@RequestBody AdminLogin login) {
        String adminname = login.getAdminname();
        String adminpassword = login.getAdminpassword();
 
        AdminLogin validateuser = aserviceimpl.validateUser(adminname, adminpassword);
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

