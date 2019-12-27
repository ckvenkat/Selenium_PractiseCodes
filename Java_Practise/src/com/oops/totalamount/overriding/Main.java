package com.oops.totalamount.overriding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String name,source,destination;
        double price;
        int choice;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the shipment name :");
        name = br.readLine();
        System.out.println("Enter the source :");
        source = br.readLine();
        System.out.println("Enter the destination :");
        destination = br.readLine();
        System.out.println("Enter the price :");
        price =Double.parseDouble(br.readLine());
        System.out.println("1. Agent\n2. Company\nEnter your choice :");
        choice = Integer.parseInt(br.readLine());
        Shipment shipment;
        if(choice == 1)
        {
            double referalFee;
            System.out.println("Enter the referal fee :");
            referalFee = Double.parseDouble(br.readLine());
            System.out.println("Agent details :");
            shipment = new AgentShipment(name,source,destination,price,referalFee);
            System.out.format("%-15s %-15s %-15s %s\n","Name","Source","Destination","Total Amount");
            System.out.format("%-15s %-15s %-15s %s\n",shipment.getname(),shipment.gesource(),shipment.getdestination(),String.format("%.2f",shipment.calculateShipmentAmount()));
        }
        else if(choice == 2)
        {
            double luxuryTax,corporateTax;
            System.out.println("Enter the luxury tax and corporate tax:");
            luxuryTax = Double.parseDouble(br.readLine());
            corporateTax = Double.parseDouble(br.readLine());
            System.out.println("Company details :");
            shipment = new CompanyShipment(name,source,destination,price,luxuryTax,corporateTax);
            System.out.format("%-15s %-15s %-15s %s\n","Name","Source","Destination","Total Amount");
            System.out.format("%-15s %-15s %-15s %s\n",shipment.getname(),shipment.gesource(),shipment.getdestination(),String.format("%.2f",shipment.calculateShipmentAmount()));
        }

	}

}
