package com.oops.displaycontainerdetails;

public class Container extends Cargo{
	private String containerNumber;
	
	public Container() {}
	
	public Container(String containerNumber) {
		this.containerNumber=containerNumber;
	}
	
	public String gecontainerNumber() {
		return containerNumber;
	}

	public void setcontainerNumber(String containerNumber) {
		this.containerNumber = containerNumber;
	}
	
	public void displayContainerDetails() {
		System.out.format("%-20s %-15s %-15s %-15s %s\n", containerNumber,getLength(),getWidth(),getHeight(),getWeight());
	}

}
