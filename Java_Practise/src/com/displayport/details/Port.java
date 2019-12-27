package com.displayport.details;

public class Port {

	private int id;
	private String name;
	private String country;

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public String getCountry() {
		return country;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Port(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public Port(int id, String name, String country) {
		this.id = id;
		this.name = name;
		this.country = country;
	}

	public String toString() {
		String outpt = String.format("%-15s %-15s %-15s\n", getId(), getName(), getCountry());
		return outpt;
	}

}
