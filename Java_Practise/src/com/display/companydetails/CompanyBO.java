package com.display.companydetails;

public class CompanyBO {
	public void displayCompanyDetails(Company[] company) {
		int outsideIndia = 0;
		for (int i = 0; i < company.length; i++) {
			if (company[i].getAddress().getCountry().equals("India")) {
				outsideIndia = outsideIndia + 1;
			}
		}
		if (outsideIndia == company.length) {
			System.out.println("All companies are inside India");
		} else {
			System.out.println("Companies outside India :");
			System.out.format("%n%-15s %-15s %-15s %-15s %s", "Company ID", "IATA Code", "FMC Code", "State",
					"Country");
			for (int a = 0; a < company.length; a++) {
				String companyId = company[a].getIdentifier();
				String iata = company[a].getIata();
				String fmc = company[a].getFmc();
				String state = company[a].getAddress().getState();
				String country = company[a].getAddress().getCountry();
				if (!country.equalsIgnoreCase("India")) {
					System.out.format("%n%-15s %-15s %-15s %-15s %s", companyId, iata, fmc, state, country);
				}

			}
		}
	}

}
