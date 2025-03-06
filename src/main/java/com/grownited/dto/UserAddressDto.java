package com.grownited.dto;

public class UserAddressDto {
	private Integer userAddressId;//primary key 
	   private Integer userId;
	   private String title;
	   private String unitName;
	   private String street;
	   private String addressDetail;
	   private String landMark;
	   private Integer cityId;
	   private Integer stateId;
	   private Integer areaId;
	   private Integer zipcode;
	   private String statename;
	   private String cityname;
	public UserAddressDto(Integer userAddressId, Integer userId, String title, String unitName, String street,
			String addressDetail, String landMark, Integer cityId, Integer stateId, Integer areaId, Integer zipcode,
			String statename, String cityname) {
		super();
		this.userAddressId = userAddressId;
		this.userId = userId;
		this.title = title;
		this.unitName = unitName;
		this.street = street;
		this.addressDetail = addressDetail;
		this.landMark = landMark;
		this.cityId = cityId;
		this.stateId = stateId;
		this.areaId = areaId;
		this.zipcode = zipcode;
		this.statename = statename;
		this.cityname = cityname;
	}
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
	public String getAddressDetail() {
		return addressDetail;
	}
	public void setAddressDetail(String addressDetail) {
		this.addressDetail = addressDetail;
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
	public String getStatename() {
		return statename;
	}
	public void setStatename(String statename) {
		this.statename = statename;
	}
	public String getCityname() {
		return cityname;
	}
	public void setCityname(String cityname) {
		this.cityname = cityname;
	}
	   
	   
}
