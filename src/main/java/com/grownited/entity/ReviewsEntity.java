package com.grownited.entity;
import java.time.LocalDate;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="reviews")
public class ReviewsEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer reviewsId;//primary key 
	private Integer userId;
	private Integer productId;
	private String rating;
	private String reviewText;
	private LocalDate createdAt;
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
	public LocalDate getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(LocalDate createdAt) {
		this.createdAt = createdAt;
	}
	
	
	
	
}
