package com.infinite.repository;

import java.util.List;

import com.infinite.model.Product;

public interface IProductDao {
	public List<Product> getAllProducts();

	public Product getProduct(int id);

	public Product addProduct(Product product);

	public void updateProduct(Product product);

	public void Delete(Product productId);
}
