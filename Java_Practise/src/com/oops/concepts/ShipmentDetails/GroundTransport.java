package com.oops.concepts.ShipmentDetails;

public class GroundTransport extends Shipment {

    private String capacity;

    GroundTransport(){}

    public GroundTransport(int id,String customerName,String arrivalPort,String departurePort,float weight, String capacity){
        this.setId(id);
        this.setCustomerName(customerName);
        this.setWeight(weight);
        this.setArrivalPort(arrivalPort);
        this.setDeparturePort(departurePort);
        this.capacity=capacity;
    }

    public void setCapacity(String capacity){this.capacity=capacity;}

    public String getCapacity() {return capacity;}

}
