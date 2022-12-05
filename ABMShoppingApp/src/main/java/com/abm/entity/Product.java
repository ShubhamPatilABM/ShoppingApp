package com.abm.entity;

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
@Table(name = "tbl_product")
public class Product {

	@Id // pk
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "p_id")
	private int productId;

	@Column(name = "p_name")
	private String productName;
	
	@Column(name = "p_category")
	private String productCategory;

	@Column(name = "p_image")
	private String productImage;

	@Column(name = "p_description")
	private String productDescription;

	@Column(name = "p_price")
	private float productPrice;

	@Column(name = "p_quantity")
	private int productquantity;

	@Column(name = "is_top_product")
	private String isTopProduct;

	@Column(name = "is_approved")
	private String isApproved;

	@ManyToOne
	@JoinColumn(name = "r_id")
	private Retailer retailer;
	
	@OneToOne(mappedBy = "product")
	private OrderLineItems orderLineItems;

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductImage() {
		return productImage;
	}

	public void setProductImage(String productImage) {
		this.productImage = productImage;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public float getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(float productPrice) {
		this.productPrice = productPrice;
	}

	public int getProductquantity() {
		return productquantity;
	}

	public void setProductquantity(int productquantity) {
		this.productquantity = productquantity;
	}

	public String getIsTopProduct() {
		return isTopProduct;
	}

	public void setIsTopProduct(String isTopProduct) {
		this.isTopProduct = isTopProduct;
	}

	public String getIsApproved() {
		return isApproved;
	}

	public void setIsApproved(String isApproved) {
		this.isApproved = isApproved;
	}

	public Retailer getRetailer() {
		return retailer;
	}

	public void setRetailer(Retailer retailer) {
		this.retailer = retailer;
	}

	public OrderLineItems getOrderLineItems() {
		return orderLineItems;
	}

	public void setOrderLineItems(OrderLineItems orderLineItems) {
		this.orderLineItems = orderLineItems;
	}

	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	

}
