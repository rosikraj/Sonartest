package com.infinite.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.infinite.model.OrderList;
import com.infinite.model.Product;
@Repository
@EnableAsync(proxyTargetClass = true)
@EnableCaching(proxyTargetClass = true)
@EnableTransactionManagement
public class OrderDaoImpl implements IOredrDao {
	private static final Logger logger = Logger.getLogger(CustomerDaoImpl.class);

	@Autowired
	private SessionFactory sesfactory;
	public void setSesfactory(SessionFactory sesfactory) {
		this.sesfactory = sesfactory;
	}

	@Transactional
	public OrderList addorder(OrderList orderlist) {
		// TODO Auto-generated method stub
		Session session = this.sesfactory.getCurrentSession();
		session.save(orderlist);
		return orderlist;
	}

	@Transactional
	public List<OrderList> getAllOrders() {
		// TODO Auto-generated method stub
		Session session = this.sesfactory.getCurrentSession();
		List<OrderList>ls=session.createQuery("from orderlist").list();
		return ls;
	}

}
