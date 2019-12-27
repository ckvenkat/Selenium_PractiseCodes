package com.oops.concepts.ShipmentDetails;

public class AirTransport extends Shipment{

    private String airwaysName;

    public AirTransport(int id,String customerName,String arrivalPort,String departurePort,float weight, String airwaysName){
        this.setId(id);
        this.setCustomerName(customerName);
        this.setWeight(weight);
        this.setArrivalPort(arrivalPort);
        this.setDeparturePort(departurePort);
        this.airwaysName=airwaysName;
    }


    public void setAirwaysName(String airwaysName){this.airwaysName=airwaysName;}
    public String getAirwaysName(){return airwaysName;}

    @Override
    void displayDetails() {
        System.out.format("%-15s %-15s %-15s %-15s%-15s%-15s",getId(),getCustomerName(),getArrivalPort(),getDeparturePort(),getWeight(),getAirwaysName());
    }
}
