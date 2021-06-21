package com.example.hellomavenrest.users;

public class Geo{
	private String lng;
	private String lat;

	public Geo() {
	}

	public Geo(String lng, String lat) {
		this.lng = lng;
		this.lat = lat;
	}

	public String getLng(){
		return lng;
	}

	public String getLat(){
		return lat;
	}
}
