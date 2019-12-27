package com.display.companydetails;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of companies :");
		int noOfCompanies = scanner.nextInt();
		Company[] companies = new Company[noOfCompanies];
		Address[] addresses = new Address[noOfCompanies];
		for (int i = 0; i < noOfCompanies; i++) {
			System.out.println("Enter the company " + (i + 1) + " details :");
			System.out.println("Enter company id :");
			String companyID = scanner.nextLine();
			System.out.println("Enter the company's IATA code :");
			String iata = scanner.nextLine();
			System.out.println("Enter the company's FMC code :");
			String fmc = scanner.nextLine();
			System.out.println("Enter the company's state :");
			String state = scanner.nextLine();
			System.out.println("Enter the company's country :");
			String country = scanner.nextLine();
			addresses[i] = new Address(state, country);
			companies[i] = new Company(companyID, iata, fmc, addresses[i]);
		}
		scanner.close();
		CompanyBO bo = new CompanyBO();
		bo.displayCompanyDetails(companies);

	}

}
