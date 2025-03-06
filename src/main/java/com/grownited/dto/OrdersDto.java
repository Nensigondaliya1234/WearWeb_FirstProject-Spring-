package com.grownited.dto;

import java.util.Date;

public class OrdersDto {
	private Integer orderId;//primary key 
	private String status;
	private Integer userId;
	private Integer totalAmount;
	private Date createdAt;
	private String firstName;
	public OrdersDto(Integer orderId, String status, Integer userId, Integer totalAmount, Date createdAt,
			String firstName) {
		super();
		this.orderId = orderId;
		this.status = status;
		this.userId = userId;
		this.totalAmount = totalAmount;
		this.createdAt = createdAt;
		this.firstName = firstName;
	}
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(Integer totalAmount) {
		this.totalAmount = totalAmount;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	
}
