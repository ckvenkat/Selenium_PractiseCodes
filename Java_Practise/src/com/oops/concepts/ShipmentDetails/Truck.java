package com.oops.concepts.ShipmentDetails;

public class Truck extends GroundTransport {

    private int sizeOfContainer;

    public Truck(int id,String customerName,String arrivalPort,String departurePort,float weight,  int sizeOfContainer, String capacity){
        this.setId(id);
        this.setCustomerName(customerName);
        this.setWeight(weight);
        this.setArrivalPort(arrivalPort);
        this.setDeparturePort(departurePort);
        this.setCapacity(capacity);
        this.sizeOfContainer=sizeOfContainer;
    }

    public void setSizeOfContainer(int sizeOfContainer) {this.sizeOfContainer = sizeOfContainer;}

    public int getSizeOfContainer() {return sizeOfContainer;}

    @Override
    void displayDetails() {
        System.out.format("%-15s %-15s %-15s %-15s%-15s%-20s%-15s",getId(),getCustomerName(),getArrivalPort(),getDeparturePort(),getWeight(),getSizeOfContainer(),getCapacity());
    }
}
