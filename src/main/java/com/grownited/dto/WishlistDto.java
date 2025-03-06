package com.grownited.dto;

import java.util.Date;

public class WishlistDto {
	private Integer wishlistId;//primary key 
	private Integer userId;
	private Integer productId;
	private Date createdAt;
	private String productName;
	public WishlistDto(Integer wishlistId, Integer userId, Integer productId, Date createdAt, String productName) {
		super();
		this.wishlistId = wishlistId;
		this.userId = userId;
		this.productId = productId;
		this.createdAt = createdAt;
		this.productName = productName;
	}
	public Integer getWishlistId() {
		return wishlistId;
	}
	public void setWishlistId(Integer wishlistId) {
		this.wishlistId = wishlistId;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	
}
