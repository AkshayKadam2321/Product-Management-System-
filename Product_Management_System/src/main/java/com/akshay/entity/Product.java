package com.akshay.entity;



import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
//because of compiler issue, i have not used lombok
@Component

@Entity
@Table
public class Product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	Integer ProductId;
	@Column
	String ProductName;
	

	@Column
	Integer ProductPrice;
	@Column
	Integer ProductQuantity;
	public Product() {
		super();
	}
	
	public Integer getProductId() {
		return ProductId;
	}
	public void setProductId(Integer productId) {
		ProductId = productId;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public Integer getProductPrice() {
		return ProductPrice;
	}
	public void setProductPrice(Integer productPrice) {
		ProductPrice = productPrice;
	}
	public Integer getProductQuantity() {
		return ProductQuantity;
	}
	public void setProductQuantity(Integer productQuantity) {
		ProductQuantity = productQuantity;
	}
	
	public Product(Integer productId, String productName, Integer productPrice, Integer productQuantity) {
		super();
		ProductId = productId;
		ProductName = productName;
		ProductPrice = productPrice;
		ProductQuantity = productQuantity;
	}
	
}
