package com.infinite.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="orderList")
public class OrderList {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="Order_Id")
private int orderid;
@Column(name="Product_Id")
private int productid;
@Column(name="Product_Name")
private String pname;
@Column (name="User_Id")
private int userid;
@Column(name="Price")
private int price;
@Column(name="Quantity")
private int quantity;
public OrderList() {
	
}
public int getOrderid() {
	return orderid;
}
public void setOrderid(int orderid) {
	this.orderid = orderid;
}
public int getProductid() {
	return productid;
}
public void setProductid(int productid) {
	this.productid = productid;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public int getUserid() {
	return userid;
}
public void setUserid(int userid) {
	this.userid = userid;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}


}
