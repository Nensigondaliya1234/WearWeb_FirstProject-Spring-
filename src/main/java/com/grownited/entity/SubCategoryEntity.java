package com.grownited.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="subCategory")
public class SubCategoryEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer subCategoryId;//primary key 
	private String subCategoryname;
	private Integer categoryId;
	public Integer getSubCategoryId() {
		return subCategoryId;
	}
	public void setSubCategoryId(Integer subCategoryId) {
		this.subCategoryId = subCategoryId;
	}
	public String getSubCategoryname() {
		return subCategoryname;
	}
	public void setSubCategoryname(String subCategoryname) {
		this.subCategoryname = subCategoryname;
	}
	public Integer getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}
	
	

}
