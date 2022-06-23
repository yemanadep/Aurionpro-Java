package com.aurionpro.model;

public class Country extends GeographicalArea{

	String countryCode;
	String name;
	int regionId;
	
	
//	public Country(String countryCode, String name, int regionId) {
//		super();
//		this.countryCode = countryCode;
//		this.name = name;
//		this.regionId = regionId;
//	}
	
//	public Country(String countryCode, String name) {
//		super();
//		this.countryCode = countryCode;
//		this.name =name;
//	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRegionId() {
		return regionId;
	}

	public void setRegionId(int regionId) {
		this.regionId = regionId;
	}

	@Override
	public String toString() {
		return "[countryCode=" + countryCode + ", name=" + name + ", regionId=" + regionId + "]";
	}
	
	
	
}
