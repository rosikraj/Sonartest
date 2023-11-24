package com.infinite.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.infinite.model.OrderList;
import com.infinite.service.IOrderService;

@RestController
@CrossOrigin("http://localhost:3000/")
public class OrderController {
	@Autowired
	IOrderService oserviceimpl;
	@RequestMapping(value = "/osave", method = RequestMethod.POST, headers = "Accept=application/json")
	public ResponseEntity<String> addorder(@RequestBody OrderList orderlist) {
		// int productId=login.getProductId();
		try {
			oserviceimpl.addorder(orderlist);
			return ResponseEntity.ok("order Added");
		} catch (Exception e) {
			// TODO: handle exception
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("order is Failed to add");
		}
 
	}

}
