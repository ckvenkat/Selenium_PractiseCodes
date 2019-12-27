package com.displayport.details;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of ports");
		int noOfPorts = scanner.nextInt();
		Port[] ports = new Port[noOfPorts];
		for (int i = 0; i < noOfPorts; i++) {
			System.out.println("Enter the port" + (i + 1) + " details");
			int id = scanner.nextInt();
			String name = scanner.nextLine();
			System.out.println("Is the port from same country[Y/N]");
			if (scanner.nextLine().equalsIgnoreCase("N")) {
				System.out.println("Enter the country");
				String country = scanner.nextLine();
				ports[i] = new Port(id, name, country);
			} else {
				ports[i] = new Port(id, name);
				ports[i].setCountry("India");
			}
		}
		scanner.close();
		System.out.println("The port details are");
		System.out.format("%-15s %-15s %-15s\n", "Id", "Name", "Country");
		for (int i = 0; i < ports.length; i++) {
			System.out.println(ports[i].toString());
		}

	}

}
