package com.oops.concepts.ShipmentDetails;

public class Shipment {

    private int id;
    private String customerName;
    private String arrivalPort;
    private String departurePort;
    private float weight;

    Shipment(){}

    public Shipment(int id,String customerName,String arrivalPort,String departurePort,float weight){
        this.id = id;
        this.customerName=customerName;
        this.weight=weight;
        this.arrivalPort=arrivalPort;
        this.departurePort=departurePort;
    }

    public void setId(int id) {this.id = id;}

    public int getId() {return id;}

    public void setCustomerName(String customerName) {this.customerName = customerName;}

    public String getCustomerName() {return customerName;}

    public void setArrivalPort(String arrivalPort) {this.arrivalPort = arrivalPort;}

    public String getArrivalPort() {return arrivalPort;}

    public void setDeparturePort(String departurePort) {this.departurePort = departurePort;}

    public String getDeparturePort() {return departurePort;}

    public void setWeight(float weight) {this.weight = weight;}

    public float getWeight() {return weight;}

    void displayDetails(){
        System.out.format("%-15s %-15s %-15s %-15s%-15s","Id","Customer name","Arrival port","Departure port","Weight");
        System.out.format("%-15s %-15s %-15s %-15s%-15s","Id",getCustomerName(),getArrivalPort(),getDeparturePort(),getWeight());
    }
}
