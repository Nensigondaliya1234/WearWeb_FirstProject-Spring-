package com.grownited.dto;

public class SubCategoryDto {
	private Integer subCategoryId;//primary key 
	private String subCategoryname;
	private Integer categoryId;
	private String categoryname;
	public SubCategoryDto(Integer subCategoryId, String subCategoryname, Integer categoryId, String categoryname) {
		super();
		this.subCategoryId = subCategoryId;
		this.subCategoryname = subCategoryname;
		this.categoryId = categoryId;
		this.categoryname = categoryname;
	}
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
	public String getCategoryname() {
		return categoryname;
	}
	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}
	
	
}
