package com.example.hellomavenrest.users;

public class UsersResponse{
	private String website;
	private Address address;
	private String phone;
	private String name;
	private Company company;
	private int id;
	private String email;
	private String username;

	public UsersResponse() {
	}

	public UsersResponse(String website, Address address, String phone, String name, Company company, int id, String email, String username) {
		this.website = website;
		this.address = address;
		this.phone = phone;
		this.name = name;
		this.company = company;
		this.id = id;
		this.email = email;
		this.username = username;
	}

	public String getWebsite(){
		return website;
	}

	public Address getAddress(){
		return address;
	}

	public String getPhone(){
		return phone;
	}

	public String getName(){
		return name;
	}

	public Company getCompany(){
		return company;
	}

	public int getId(){
		return id;
	}

	public String getEmail(){
		return email;
	}

	public String getUsername(){
		return username;
	}
}
