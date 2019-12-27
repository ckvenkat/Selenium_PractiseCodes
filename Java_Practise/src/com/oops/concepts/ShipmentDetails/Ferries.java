package com.oops.concepts.ShipmentDetails;

public class Ferries extends WaterTransport {

    private String agentName;

    public Ferries(int id,String customerName,String arrivalPort,String departurePort,float weight,String agentName,  String capacity){
        this.setId(id);
        this.setCustomerName(customerName);
        this.setWeight(weight);
        this.setArrivalPort(arrivalPort);
        this.setDeparturePort(departurePort);
        this.setCapacity(capacity);
        this.agentName=agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public String getAgentName() {
        return agentName;
    }

    @Override
    void displayDetails() {
        System.out.format("%-15s %-15s %-15s %-15s%-15s%-20s%-15s",getId(),getCustomerName(),getArrivalPort(),getDeparturePort(),getWeight(),getAgentName(),getCapacity());
    }
}
