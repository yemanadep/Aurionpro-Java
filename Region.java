package com.aurionpro.model;

public class Region extends GeographicalArea {
	int regionId;
	String region;
	
	
	
//	public Region(int regionId, String region) {
//		super();
//		this.regionId = regionId;
//		this.region = region;
//	}

	@Override
	public String toString() {
		return "[regionId=" + regionId + ", region=" + region + "]";
	}

	public int getId() {
		return regionId;
	}

	public void setId(int id) {
		this.regionId = id;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}
	
	
}
