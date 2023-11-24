package com.infinite.repository;

import java.util.List;
import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.infinite.model.Product;
@Repository
@EnableAsync(proxyTargetClass = true)
@EnableCaching(proxyTargetClass = true)
@EnableTransactionManagement
public class ProductDaoImpl implements IProductDao{
	private static final Logger logger = Logger.getLogger(CustomerDaoImpl.class);

	@Autowired
	private SessionFactory sesfactory;
	public void setSesfactory(SessionFactory sesfactory) {
		this.sesfactory = sesfactory;
	}

	@Transactional
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		Session session = this.sesfactory.getCurrentSession();
		List<Product>ls=session.createQuery("from product").list();
		return ls;
	}

	@Transactional
	public Product getProduct(int id) {
		// TODO Auto-generated method stub
		Session session = this.sesfactory.getCurrentSession();
		Product product=(Product)session.get(Product.class, id);
		return product;
	}

	@Transactional
	public Product addProduct(Product product) {
		// TODO Auto-generated method stub
		Session session = this.sesfactory.getCurrentSession();
		session.save(product);
		return product;
	}

	@Transactional
	public void updateProduct(Product product) {
		// TODO Auto-generated method stub
		Session session = this.sesfactory.getCurrentSession();
		Query query=session.createQuery("update product set Quantity= :quantity WHERE Product_Id= :productid");
		session.update(query);	
	}

	@Transactional
	public void Delete(Product productId) {
		// TODO Auto-generated method stub
		Session session = this.sesfactory.getCurrentSession();
		Query query=session.createQuery("delete FROM Product WHERE Product_Id= :productId");
		session.delete(query);
		
	}

}
