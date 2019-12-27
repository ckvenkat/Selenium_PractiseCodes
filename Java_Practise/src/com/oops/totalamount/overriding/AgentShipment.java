package com.oops.totalamount.overriding;

public class AgentShipment extends Shipment{
	private Double referalFee;
	
	public Double getreferalFee() {
		return referalFee;
	}

	public void setreferalFee(Double referalFee) {
		this.referalFee = referalFee;
	}
	
	public AgentShipment(String name,String source,String destination,double price,double referalFee) {
		this.name = name;
		this.source = source;
		this.destination = destination;
		this.price = price;
		this.referalFee = referalFee;
	}
	
	double calculateShipmentAmount()
    {
        price=getprice()+getreferalFee();
        return price;
    }

}
