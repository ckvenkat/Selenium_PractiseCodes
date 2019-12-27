package com.oops.totalamount.overriding;

public class CompanyShipment extends Shipment{
	private Double luxuryTax;
	private Double corporateTax;
	
	public Double getluxuryTax() {
		return luxuryTax;
	}

	public void setluxuryTax(Double luxuryTax) {
		this.luxuryTax = luxuryTax;
	}
	
	public Double getcorporateTax() {
		return corporateTax;
	}

	public void setcorporateTax(Double corporateTax) {
		this.corporateTax = corporateTax;
	}
	
	public CompanyShipment(String name,String source,String destination,double price,double luxuryTax,double corporateTax){
		this.name=name;
        this.source=source;
        this.destination=destination;
        this.price=price;
        this.luxuryTax=luxuryTax;
        this.corporateTax=corporateTax;
	}
	
	double calculateShipmentAmount()
    {
        luxuryTax=price*(luxuryTax/100);
        corporateTax=price*(corporateTax/100);
        price=price+luxuryTax+corporateTax;
        return price;
    }

}
