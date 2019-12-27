package com.oops.concepts.ShipmentDetails;

public class ContainerShip extends WaterTransport {

    private String companyName;

    public ContainerShip(int id,String customerName,String arrivalPort,String departurePort,float weight, String companyName,String capacity){
        this.setId(id);
        this.setCustomerName(customerName);
        this.setWeight(weight);
        this.setArrivalPort(arrivalPort);
        this.setDeparturePort(departurePort);
        this.setCapacity(capacity);
        this.companyName=companyName;
    }


    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    @Override
    void displayDetails() {
        System.out.format("%-15s %-15s %-15s %-15s%-15s%-20s%-15s",getId(),getCustomerName(),getArrivalPort(),getDeparturePort(),getWeight(),getCompanyName(),getCapacity());
    }

}
