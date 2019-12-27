package com.oops.concepts.ShipmentDetails;

public class Rail extends GroundTransport {

    private int numberOfContainers;

    public Rail(int id,String customerName,String arrivalPort,String departurePort,float weight,  int numberOfContainers, String capacity){
        this.setId(id);
        this.setCustomerName(customerName);
        this.setWeight(weight);
        this.setArrivalPort(arrivalPort);
        this.setDeparturePort(departurePort);
        this.setCapacity(capacity);
        this.numberOfContainers=numberOfContainers;
    }


    public void setNumberOfContainers(int numberOfContainers) {this.numberOfContainers = numberOfContainers;}

    public int getNumberOfContainers() {return numberOfContainers;}

    @Override
    void displayDetails() {
        System.out.format("%-15s %-15s %-15s %-15s%-15s%-20s%-15s",getId(),getCustomerName(),getArrivalPort(),getDeparturePort(),getWeight(),getNumberOfContainers(),getCapacity());

    }
}
