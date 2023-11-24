package com.infinite.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.infinite.model.Product;
import com.infinite.repository.IProductDao;

@Service
public class ProductServiceImpl implements IProductService{
	@Autowired
	IProductDao pdaoimpl;

	@Transactional
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return pdaoimpl.getAllProducts();
	}

	@Transactional
	public Product getProduct(int id) {
		// TODO Auto-generated method stub
		return pdaoimpl.getProduct(id);
	}

	@Transactional
	public void addProduct(Product product) {
		// TODO Auto-generated method stub
		pdaoimpl.addProduct(product);
	}

	@Transactional
	public void updateProduct(Product product) {
		// TODO Auto-generated method stub
		pdaoimpl.updateProduct(product);
	}

	@Transactional
	public void Delete(Product productId) {
		// TODO Auto-generated method stub
		pdaoimpl.Delete(productId);
		
	}
}
