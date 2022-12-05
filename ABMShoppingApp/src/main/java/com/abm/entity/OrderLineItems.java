package com.abm.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_order_line_items")
public class OrderLineItems {

	@Id // pk
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "o_det_id")
	private int oderDetailId;

	@Column(name = "sub_total_price")
	private float subTotalPrice;

	@Column(name = "o_qty")
	private int orderQuantity;

	@Column(name = "o_date")
	private LocalDate orderDate;

	@Column(name = "o_status")
	private String orderStatus;

	@ManyToOne
	@JoinColumn(name = "o_id")
	private Order order;

	@OneToOne
	@JoinColumn(name = "p_id")
	private Product product;

	public int getOderDetailId() {
		return oderDetailId;
	}

	public void setOderDetailId(int oderDetailId) {
		this.oderDetailId = oderDetailId;
	}

	public float getSubTotalPrice() {
		return subTotalPrice;
	}

	public void setSubTotalPrice(float subTotalPrice) {
		this.subTotalPrice = subTotalPrice;
	}

	public int getOrderQuantity() {
		return orderQuantity;
	}

	public void setOrderQuantity(int orderQuantity) {
		this.orderQuantity = orderQuantity;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	

}
