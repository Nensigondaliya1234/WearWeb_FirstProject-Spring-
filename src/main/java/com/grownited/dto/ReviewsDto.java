package com.grownited.dto;

import java.util.Date;

public class ReviewsDto {
	private Integer reviewsId;//primary key 
	private Integer userId;
	private Integer productId;
	private String rating;
	private String reviewText;
	private Date createdAt;
	private String productName;
	public ReviewsDto(Integer reviewsId, Integer userId, Integer productId, String rating, String reviewText,
			Date createdAt, String productName) {
		super();
		this.reviewsId = reviewsId;
		this.userId = userId;
		this.productId = productId;
		this.rating = rating;
		this.reviewText = reviewText;
		this.createdAt = createdAt;
		this.productName = productName;
	}
	public Integer getReviewsId() {
		return reviewsId;
	}
	public void setReviewsId(Integer reviewsId) {
		this.reviewsId = reviewsId;
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
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public String getReviewText() {
		return reviewText;
	}
	public void setReviewText(String reviewText) {
		this.reviewText = reviewText;
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
