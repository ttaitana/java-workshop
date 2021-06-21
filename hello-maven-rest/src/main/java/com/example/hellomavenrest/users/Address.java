package com.example.hellomavenrest.users;

public class Address{
	private String zipcode;
	private Geo geo;
	private String suite;
	private String city;
	private String street;

	public Address() {
	}

	public Address(String zipcode, Geo geo, String suite, String city, String street) {
		this.zipcode = zipcode;
		this.geo = geo;
		this.suite = suite;
		this.city = city;
		this.street = street;
	}

	public String getZipcode(){
		return zipcode;
	}

	public Geo getGeo(){
		return geo;
	}

	public String getSuite(){
		return suite;
	}

	public String getCity(){
		return city;
	}

	public String getStreet(){
		return street;
	}
}
