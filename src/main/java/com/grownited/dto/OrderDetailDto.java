package com.grownited.dto;

public class OrderDetailDto {
	private Integer orderDetailId;//primary key 
	private Integer productId;
	private Integer orderId;
	private Integer quantity;
	private Integer price;
	private String status;
	private Integer totalAmount;
	private String productName;
	public OrderDetailDto(Integer orderDetailId, Integer productId, Integer orderId, Integer quantity, Integer price,
			String status, Integer totalAmount, String productName) {
		super();
		this.orderDetailId = orderDetailId;
		this.productId = productId;
		this.orderId = orderId;
		this.quantity = quantity;
		this.price = price;
		this.status = status;
		this.totalAmount = totalAmount;
		this.productName = productName;
	}
	public Integer getOrderDetailId() {
		return orderDetailId;
	}
	public void setOrderDetailId(Integer orderDetailId) {
		this.orderDetailId = orderDetailId;
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Integer getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(Integer totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	
}
