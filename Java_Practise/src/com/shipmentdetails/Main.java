package com.shipmentdetails;

import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Shipment shipment = new Shipment(id, shipperName, modeOfTransportation, totalWeight, arrivalPort, departurePort);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of shipments :");
		int noOfShipments = Integer.parseInt(scanner.nextLine());
		String[] shipperName = new String[noOfShipments];
        String[] modeOfTransport =  new String[noOfShipments];
        Float[] totalWeight =  new Float[noOfShipments];
        String[] departurePort = new String[noOfShipments];
        String[] arrivalPort = new String[noOfShipments];
        Shipment[] shipment = new Shipment[noOfShipments];
        for(int i=0;i<noOfShipments;i++){
            System.out.println("Enter the shipment "+(i+1)+" details");
            System.out.println("Enter the shipper name :");
            shipperName[i]=scanner.nextLine();
            System.out.println("Enter the mode of transportation :");
            modeOfTransport[i]=scanner.nextLine();
            System.out.println("Enter the total weight :");
            totalWeight[i]=Float.parseFloat(scanner.nextLine());
            System.out.println("Enter the arrival port :");
            arrivalPort[i]=scanner.nextLine();
            System.out.println("Enter the departure port :");
            departurePort[i]=scanner.nextLine();
            shipment[i] = Shipment.createNewShipment(shipperName[i],modeOfTransport[i],totalWeight[i],arrivalPort[i],departurePort[i]);
        }
        scanner.close();

        System.out.println("Shipment details are");
        System.out.println(String.format("%-15s%-15s%-25s%-15s%-20s%s","Id","Shippername","Mode of transportation","Total weight","Arrival port","Departure port"));
        System.out.println();
        for(int i=0;i<noOfShipments;i++){
            System.out.println(shipment[i].toString());
        }
    }

}
