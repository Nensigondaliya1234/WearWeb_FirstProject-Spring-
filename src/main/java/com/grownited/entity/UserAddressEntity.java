package com.grownited.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="useraddress")
public class UserAddressEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer userAddressId;//primary key 
   private Integer userId;
   private String title;
   private String unitName;
   private String street;
   private String landMark;
   private Integer cityId;
   private Integer stateId;
   private Integer areaId;
   private Integer zipcode;
public Integer getUserAddressId() {
	return userAddressId;
}
public void setUserAddressId(Integer userAddressId) {
	this.userAddressId = userAddressId;
}
public Integer getUserId() {
	return userId;
}
public void setUserId(Integer userId) {
	this.userId = userId;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getUnitName() {
	return unitName;
}
public void setUnitName(String unitName) {
	this.unitName = unitName;
}
public String getStreet() {
	return street;
}
public void setStreet(String street) {
	this.street = street;
}
public String getLandMark() {
	return landMark;
}
public void setLandMark(String landMark) {
	this.landMark = landMark;
}
public Integer getCityId() {
	return cityId;
}
public void setCityId(Integer cityId) {
	this.cityId = cityId;
}
public Integer getStateId() {
	return stateId;
}
public void setStateId(Integer stateId) {
	this.stateId = stateId;
}
public Integer getAreaId() {
	return areaId;
}
public void setAreaId(Integer areaId) {
	this.areaId = areaId;
}
public Integer getZipcode() {
	return zipcode;
}
public void setZipcode(Integer zipcode) {
	this.zipcode = zipcode;
}
   
   
   
}
