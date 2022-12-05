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
@Table(name = "tbl_retailer")
public class Retailer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "r_id")
	private int retId;

	@Column(name = "r_name")
	private String retName;

	@Column(name = "r_email")
	private String retEmail;

	@Column(name = "r_passwrd")
	private String retPassword;

	@Column(name = "r_mob")
	private long retMob;

	@OneToMany(mappedBy = "retailer")
	private List<Product> prodList;

	public int getRetId() {
		return retId;
	}

	public void setRetId(int retId) {
		this.retId = retId;
	}

	public String getRetName() {
		return retName;
	}

	public void setRetName(String retName) {
		this.retName = retName;
	}

	public String getRetEmail() {
		return retEmail;
	}

	public void setRetEmail(String retEmail) {
		this.retEmail = retEmail;
	}

	public String getRetPassword() {
		return retPassword;
	}

	public void setRetPassword(String retPassword) {
		this.retPassword = retPassword;
	}

	public long getRetMob() {
		return retMob;
	}

	public void setRetMob(long retMob) {
		this.retMob = retMob;
	}

	public List<Product> getProdList() {
		return prodList;
	}

	public void setProdList(List<Product> prodList) {
		this.prodList = prodList;
	}

	

}