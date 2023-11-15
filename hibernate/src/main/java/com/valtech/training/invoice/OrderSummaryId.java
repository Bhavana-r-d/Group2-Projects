package com.valtech.training.invoice;

import java.io.Serializable;


public class OrderSummaryId implements Serializable {
	

	private Product productId;

	private Order id;
	
	public OrderSummaryId() {
	}

	public OrderSummaryId(Product productId, Order id) {
		this.productId = productId;
		this.id = id;
	}

	public Product getProductId() {
		return productId;
	}

	public void setProductId(Product productId) {
		this.productId = productId;
	}

	public Order getId() {
		return id;
	}

	public void setId(Order id) {
		this.id = id;
	}

	
	
	
	


	
}