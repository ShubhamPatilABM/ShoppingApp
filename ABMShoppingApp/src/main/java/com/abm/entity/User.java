package com.abm.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_user")
public class User {

	@Id // pk
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "u_id")
	private int userId;

	@Column(name = "u_name")
	private String userName;

	@Column(name = "u_mobile")
	private long mobileNumber;

	@Column(name = "u_email", unique = true)
	private String userEmail;

	@Column(name = "u_password")
	private String userPassword;

	@OneToMany(mappedBy = "user")
	private List<Order> oderList;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public List<Order> getOderList() {
		return oderList;
	}

	public void setOderList(List<Order> oderList) {
		this.oderList = oderList;
	}

}
