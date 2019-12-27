package com.cargo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cargo cargo = new Cargo();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the cargo details:");
        System.out.println("Enter the name");
        cargo.setName(scanner.nextLine());
        System.out.println("Enter the description");
        cargo.setDescription(scanner.nextLine());
        System.out.println("Enter the length");
        cargo.setLength(Double.parseDouble(scanner.nextLine()));
        System.out.println("Enter the width");
        cargo.setWidth(Double.parseDouble(scanner.nextLine()));
        cargo.displayCargoDetails();
        scanner.close();

	}

}
