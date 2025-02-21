package com.grownited.entity;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Product")
public class ProductEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer productId;//primary key 
	private String productName;
	private Integer categoryId;
	private Integer subCategoryId;
	private Integer basePrice;
	private Integer offerePercentage;
	private Integer offerePrice;
	private String productDetail;
	private String productImageURL1;
	private String productImageURL2;
	private String productImageURL3;
	private Date createdAt;
	private String quantity;
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Integer getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}
	public Integer getSubCategoryId() {
		return subCategoryId;
	}
	public void setSubCategoryId(Integer subCategoryId) {
		this.subCategoryId = subCategoryId;
	}
	public Integer getBasePrice() {
		return basePrice;
	}
	public void setBasePrice(Integer basePrice) {
		this.basePrice = basePrice;
	}
	public Integer getOfferePercentage() {
		return offerePercentage;
	}
	public void setOfferePercentage(Integer offerePercentage) {
		this.offerePercentage = offerePercentage;
	}
	public Integer getOfferePrice() {
		return offerePrice;
	}
	public void setOfferePrice(Integer offerePrice) {
		this.offerePrice = offerePrice;
	}
	public String getProductDetail() {
		return productDetail;
	}
	public void setProductDetail(String productDetail) {
		this.productDetail = productDetail;
	}
	public String getProductImageURL1() {
		return productImageURL1;
	}
	public void setProductImageURL1(String productImageURL1) {
		this.productImageURL1 = productImageURL1;
	}
	public String getProductImageURL2() {
		return productImageURL2;
	}
	public void setProductImageURL2(String productImageURL2) {
		this.productImageURL2 = productImageURL2;
	}
	public String getProductImageURL3() {
		return productImageURL3;
	}
	public void setProductImageURL3(String productImageURL3) {
		this.productImageURL3 = productImageURL3;
	}
	
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	
	
}
