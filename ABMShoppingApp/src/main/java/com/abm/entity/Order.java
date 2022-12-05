package com.abm.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "tbl_order")
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "o_id")
	private int orderId;

	@Column(name = "total_quantity")
	private int totalQuantity;

	@Column(name = "total_price")
	private float totalPrice;

	@ManyToOne
	@JoinColumn(name = "u_id")
	private User user;

	@OneToMany(mappedBy = "order")
	private List<OrderLineItems> lineItemList;

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getTotalQuantity() {
		return totalQuantity;
	}

	public void setTotalQuantity(int totalQuantity) {
		this.totalQuantity = totalQuantity;
	}

	public float getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(float totalPrice) {
		this.totalPrice = totalPrice;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<OrderLineItems> getLineItemList() {
		return lineItemList;
	}

	public void setLineItemList(List<OrderLineItems> lineItemList) {
		this.lineItemList = lineItemList;
	}
	
	

}
