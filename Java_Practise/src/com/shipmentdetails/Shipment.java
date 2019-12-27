package com.shipmentdetails;
public class Shipment {
	private int id;
	private String shipperName;
	private String modeOfTransportation;
	private Float totalWeight;
	private String arrivalPort;
	private String departurePort;
	static int nextShipmentId = 1000;
	
	public Shipment(int id,String shipperName,String modeOfTransportation,Float totalWeight,String arrivalPort,String departurePort) {
		this.id = id;
		this.shipperName = shipperName;
		this.modeOfTransportation = modeOfTransportation;
		this.totalWeight = totalWeight;
		this.arrivalPort = arrivalPort;
		this.departurePort = departurePort;
	}

	/*public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getShipperName() {
		return shipperName;
	}

	public void setShipperName(String shipperName) {
		this.shipperName = shipperName;
	}

	public String getModeOfTransportation() {
		return modeOfTransportation;
	}

	public void setModeOfTransportation(String modeOfTransportation) {
		this.modeOfTransportation = modeOfTransportation;
	}

	public Float getTotalWeight() {
		return totalWeight;
	}

	public void setTotalWeight(Float totalWeight) {
		this.totalWeight = totalWeight;
	}

	public String getArrivalPort() {
		return arrivalPort;
	}

	public void setArrivalPort(String arrivalPort) {
		this.arrivalPort = arrivalPort;
	}

	public String getDeparturePort() {
		return departurePort;
	}

	public void setDeparturePort(String departurePort) {
		this.departurePort = departurePort;
	}*/

	public static Shipment createNewShipment(String shipperName,String modeOfTransportation,Float totalWeight,String arrivalPort,String departurePort) {
		nextShipmentId=nextShipmentId+1;
		Shipment shipment = new Shipment(nextShipmentId,shipperName,modeOfTransportation,totalWeight,arrivalPort,departurePort);
		return shipment;		
	}

	public String toString() {
		return String.format("%-15d%-15s%-25s%-15s%-20s%s",this.id,this.shipperName,this.modeOfTransportation,this.totalWeight.toString()+"Kg",this.arrivalPort,this.departurePort);
	}

}
