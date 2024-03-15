package com.prowings;

public class Address {
	
	private int pincod;
	private String city;
	private String Country;
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(int pincod, String city, String country) {
		super();
		this.pincod = pincod;
		this.city = city;
		Country = country;
	}

	public int getPincod() {
		return pincod;
	}

	public void setPincod(int pincod) {
		this.pincod = pincod;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	@Override
	public String toString() {
		return "Address [pincod=" + pincod + ", city=" + city + ", Country=" + Country + "]";
	}

}
