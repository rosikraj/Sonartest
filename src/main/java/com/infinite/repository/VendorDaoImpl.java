package com.infinite.repository;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.infinite.model.VendorLogin;
@Repository
@EnableAsync(proxyTargetClass = true)
@EnableCaching(proxyTargetClass = true)
@EnableTransactionManagement
public class VendorDaoImpl implements IvendorDao {
	private static final Logger logger = Logger.getLogger(VendorDaoImpl.class);

	@Autowired
	private SessionFactory sesfactory;
	public void setSesfactory(SessionFactory sesfactory) {
		this.sesfactory = sesfactory;
	}

	@Override
	public VendorLogin addVendor(VendorLogin vendorLogin) {
		// TODO Auto-generated method stub
		Session session = this.sesfactory.getCurrentSession();
		session.save(vendorLogin);
		return vendorLogin;
	}

	@Override
	public VendorLogin validateuser(String username, String password) {
		// TODO Auto-generated method stub
		Session session = this.sesfactory.getCurrentSession();
		Query query=session.createQuery("FROM VendorLogin WHERE First_name= :username AND password= :password");
		query.setParameter("username", username);
		query.setParameter("password", password);
		VendorLogin validateuser=(VendorLogin) query.uniqueResult();
		return validateuser;
	}

}
