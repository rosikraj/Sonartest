package com.infinite.service;

import java.util.List;

import com.infinite.model.Product;

public interface IProductService {
	public List<Product> getAllProducts();

	public Product getProduct(int id);

	public void addProduct(Product product);

	public void updateProduct(Product product);

	public void Delete(Product productId);

}
