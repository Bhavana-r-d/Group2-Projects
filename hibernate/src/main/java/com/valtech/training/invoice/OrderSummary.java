
package com.valtech.training.invoice;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;



@Entity
@IdClass("OrderSummaryId")
public class OrderSummary {

	@Id
	
	private Order id;
	
	@Id
	private Product productId;
	private int productQuantity;
	
	
	
	
	
	public OrderSummary(Order id, Product productId, int productQuantity) {
		this.id = id;
		this.productId = productId;
		this.productQuantity = productQuantity;
	}



	public OrderSummary() {
	}
	
	

	public OrderSummary(int productQuantity) {
		this.productQuantity = productQuantity;
	}



	public Order getId() {
		return id;
	}



	public void setId(Order id) {
		this.id = id;
	}



	public Product getProductId() {
		return productId;
	}



	public void setProductId(Product productId) {
		this.productId = productId;
	}



	public int getProductQuantity() {
		return productQuantity;
	}



	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}



	
	
	

}
