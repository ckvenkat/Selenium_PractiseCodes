package com.oops.totalamount.overriding;

public class Shipment {
	protected String name;
	protected String source;
	protected String destination;
	protected Double price;
	
	Shipment(){}
	
	public Shipment(String name,String source,String destination,Double price) {
		this.name=name;
		this.source=source;
		this.destination=destination;
		this.price=price;
	}
	
	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}
	
	public String gesource() {
		return source;
	}

	public void setsource(String source) {
		this.source = source;
	}
	
	public String getdestination() {
		return destination;
	}

	public void setdestination(String destination) {
		this.destination = destination;
	}
	
	public Double getprice() {
		return price;
	}

	public void setprice(Double price) {
		this.price = price;
	}
	
	double calculateShipmentAmount() {
		System.out.format("%-15s %-15s %-15s %s","Name","Source","Destination","Total Amount");
		return price;
	}

}
