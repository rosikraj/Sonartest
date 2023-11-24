package com.infinite.repository;

import java.util.List;

import com.infinite.model.OrderList;


public interface IOredrDao {
	public OrderList addorder(OrderList orderlist);
	public List<OrderList> getAllOrders();

}
