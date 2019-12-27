package com.oops.concepts.ShipmentDetails;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number of shipments");
        int n = Integer.parseInt(buf.readLine());
        Shipment[] shipmentArray = new Shipment[n];

        for(int i=0;i<n;i++){
            System.out.println("Enter the transportation "+(i+1)+" details :");
            System.out.println("Select the transportation mode");
            System.out.println("1)Air\n2)Truck\n3)Rail\n4)BulkCarrier\n5)ContainerShip\n6)Ferries");
            System.out.println("Enter your choice");
            int option = Integer.parseInt(buf.readLine());
            String details;
            String[] splitDetails;
            switch(option){
                case 1:
                    System.out.println("Enter the shipment "+(i+1)+" details");
                    details=buf.readLine();
                    splitDetails = details.split(",");
                    shipmentArray[i]=new AirTransport(Integer.parseInt(splitDetails[0]),splitDetails[1],splitDetails[2],splitDetails[3],Float.parseFloat(splitDetails[4]),splitDetails[5]);
                    break;
                case 2:
                    System.out.println("Enter the shipment "+(i+1)+" details");
                    details=buf.readLine();
                    splitDetails = details.split(",");
                    shipmentArray[i]=new Truck(Integer.parseInt(splitDetails[0]),splitDetails[1],splitDetails[2],splitDetails[3],Float.parseFloat(splitDetails[4]),Integer.parseInt(splitDetails[5]),splitDetails[6]);
                    break;
                case 3:
                    System.out.println("Enter the shipment "+(i+1)+" details");
                    details=buf.readLine();
                    splitDetails = details.split(",");
                    shipmentArray[i]=new Rail(Integer.parseInt(splitDetails[0]),splitDetails[1],splitDetails[2],splitDetails[3],Float.parseFloat(splitDetails[4]),Integer.parseInt(splitDetails[5]),splitDetails[6]);
                    break;
                case 4:
                    System.out.println("Enter the shipment "+(i+1)+" details");
                    details=buf.readLine();
                    splitDetails = details.split(",");
                    shipmentArray[i]=new BulkCarrier(Integer.parseInt(splitDetails[0]),splitDetails[1],splitDetails[2],splitDetails[3],Float.parseFloat(splitDetails[4]),splitDetails[5],splitDetails[6]);
                    break;
                case 5:
                    System.out.println("Enter the shipment "+(i+1)+" details");
                    details=buf.readLine();
                    splitDetails = details.split(",");
                    shipmentArray[i]=new ContainerShip(Integer.parseInt(splitDetails[0]),splitDetails[1],splitDetails[2],splitDetails[3],Float.parseFloat(splitDetails[4]),splitDetails[5],splitDetails[6]);
                    break;
                case 6:
                    System.out.println("Enter the shipment "+(i+1)+" details");
                    details=buf.readLine();
                    splitDetails = details.split(",");
                    shipmentArray[i]=new Ferries(Integer.parseInt(splitDetails[0]),splitDetails[1],splitDetails[2],splitDetails[3],Float.parseFloat(splitDetails[4]),splitDetails[5],splitDetails[6]);
                    break;
            }
        }
        System.out.println("Enter the mode to display");
        String mode = buf.readLine();
        int identifier =0;
        for(int i=0;i<shipmentArray.length;i++){
            if(shipmentArray[i].getClass().getName().contains(mode)){
                identifier++;
                switch(mode){
                    case "Air":
                        System.out.println("Mode of Transportation : Air");
                        System.out.format("%-15s%-15s%-15s%-15s%-15s%-15s\n","Id","Customer name","Arrival port","Departure port","Weight","AirwaysName");
                        shipmentArray[i].displayDetails();
                        break;
                    case "Truck":
                        System.out.println("Mode of Transportation : Ground");
                        System.out.format("%-15s%-15s%-15s%-15s%-15s%-20s%-15s\n","Id","Customer name","Arrival port","Departure port","Weight","Size of container","Capacity");
                        shipmentArray[i].displayDetails();
                        break;
                    case "Rail":
                        System.out.println("Mode of Transportation : Ground");
                        System.out.format("%-15s%-15s%-15s%-15s%-15s%-20s%-15s\n","Id","Customer name","Arrival port","Departure port","Weight","No of containers","Capacity");
                        shipmentArray[i].displayDetails();
                        break;
                    case "BulkCarrier":
                        System.out.println("Mode of Transportation : Water");
                        System.out.format("%-15s%-15s%-15s%-15s%-15s%-15s%-15s\n","Id","Customer name","Arrival port","Departure port","Weight","Company name","Capacity");
                        shipmentArray[i].displayDetails();
                        break;
                    case "ContainerShip":
                        System.out.println("Mode of Transportation : Water");
                        System.out.format("%-15s%-15s%-15s%-15s%-15s%-15s%-15s\n","Company name","Capacity","Sid","Customer name","Arrival port","Departure port","Weight");
                        shipmentArray[i].displayDetails();
                        break;
                    case "Ferries":
                        System.out.println("Mode of Transportation : Water");
                        System.out.format("%-15s%-15s%-15s%-15s%-15s%-15s%-15s\n","Id","Customer name","Arrival port","Departure port","Weight","Agent name","Capacity");
                        shipmentArray[i].displayDetails();
                        break;
                }
                break;
            }
        }
        if(identifier==0){
            System.out.println("No shipment available");
        }
    }
}

