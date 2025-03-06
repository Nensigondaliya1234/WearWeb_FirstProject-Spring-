package com.grownited.dto;

public class CityDto {
	private Integer cityId;//primary key 
	private String cityname;
	private Integer stateId; 
	private String statename;
	public CityDto(Integer cityId, String cityname, Integer stateId, String statename) {
		super();
		this.cityId = cityId;
		this.cityname = cityname;
		this.stateId = stateId;
		this.statename = statename;
	}
	public Integer getCityId() {
		return cityId;
	}
	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}
	public String getCityname() {
		return cityname;
	}
	public void setCityname(String cityname) {
		this.cityname = cityname;
	}
	public Integer getStateId() {
		return stateId;
	}
	public void setStateId(Integer stateId) {
		this.stateId = stateId;
	}
	public String getStatename() {
		return statename;
	}
	public void setStatename(String statename) {
		this.statename = statename;
	}
	
	
}
