package com.infinite.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.infinite.model.Product;
import com.infinite.service.IProductService;

@RestController
@CrossOrigin("http://localhost:3000/")
public class ProductController {
	@Autowired
	IProductService pserviceimpl;
	@RequestMapping(value = "/save", method = RequestMethod.POST, headers = "Accept=application/json")
	public ResponseEntity<String> addProduct(@RequestBody Product product) {
		try {
			pserviceimpl.addProduct(product);
			return ResponseEntity.ok("Product Added");
		} catch (Exception e) {
			// TODO: handle exception
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Product Add Failsd");
		}
 
	}
	@RequestMapping(value = "/delete", method = RequestMethod.POST, headers = "Accept=application/json")
	public ResponseEntity<String> Delete(@RequestBody Product productId) {
		try {
			pserviceimpl.Delete(productId);
			return ResponseEntity.ok("Product delete");
		} catch (Exception e) {
			// TODO: handle exception
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Product not deleted");
		}
 
	}
 
	@RequestMapping(value = "/update", method = RequestMethod.POST, headers = "Accept=application/json")
	public ResponseEntity<String> updateProduct(@RequestBody Product productId, Product quantity) {
		try {
			pserviceimpl.updateProduct(productId);
			return ResponseEntity.ok("Product update");
		} catch (Exception e) {
			// TODO: handle exception
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Product not updated");
		}
	}
	
	@RequestMapping(value = "/display", method = RequestMethod.POST, headers = "Accept=application/json")
	public List<Product> getAllProducts(){
		return pserviceimpl.getAllProducts();
		
	}
}

