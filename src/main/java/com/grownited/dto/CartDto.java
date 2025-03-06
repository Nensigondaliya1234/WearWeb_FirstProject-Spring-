package com.grownited.dto;

public class CartDto {
	private Integer cartId;//primary key 
	private Integer quantity;
	private Integer productId;
	private Integer userId;
	private String productName;
	public CartDto(Integer cartId, Integer quantity, Integer productId, Integer userId, String productName) {
		super();
		this.cartId = cartId;
		this.quantity = quantity;
		this.productId = productId;
		this.userId = userId;
		this.productName = productName;
	}
	public Integer getCartId() {
		return cartId;
	}
	public void setCartId(Integer cartId) {
		this.cartId = cartId;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
}
