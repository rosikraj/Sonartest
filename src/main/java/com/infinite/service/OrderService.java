package com.infinite.service;

import javax.transaction.Transactional;
import org.springframework.stereotype.Service;
import com.infinite.model.OrderList;
import com.infinite.repository.IOredrDao;
@Service
public class OrderService implements IOrderService{
	IOredrDao iorderdao;
	@Transactional
	public OrderList addorder(OrderList orderlist) {
		// TODO Auto-generated method stub
		return iorderdao.addorder(orderlist);
	}
}
