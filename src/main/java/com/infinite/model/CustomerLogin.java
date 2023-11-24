package com.infinite.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Customer")
public class CustomerLogin {

	@Id
	@Column(name = "User_Id")
	private int user_Id;
	
	@Column(name = "First_name")
	private String username;
	
	@Column(name = "Last_name")
	private String last_name;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "Address")
	private String address;
	
	@Column(name = "Phno")
	private String phno;
	
	@Column(name = "Password")
	private String password;
	
	@Column(name = "Confirm_Password")
	private String confirm_Password;

	public int getUser_Id() {
		return user_Id;
	}

	public void setUser_Id(int user_Id) {
		this.user_Id = user_Id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhno() {
		return phno;
	}

	public void setPhno(String phno) {
		this.phno = phno;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirm_Password() {
		return confirm_Password;
	}

	public void setConfirm_Password(String confirm_Password) {
		this.confirm_Password = confirm_Password;
	}

	
	
}
