package com.oops.displaycontainerdetails;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of containers");
		int n = Integer.parseInt(reader.readLine());
		Container[] container = new Container[n];
		for(int i=0;i<n;i++) {
			container[i] = new Container();
			System.out.println("Enter the container "+(i+1)+" details: ");
			String containerDetails = reader.readLine();
	        String[] tmpDetails = containerDetails.split(",");
	        container[i].setcontainerNumber(tmpDetails[0]);
            container[i].setLength(Float.parseFloat(tmpDetails[1]));
            container[i].setWidth(Float.parseFloat(tmpDetails[2]));
            container[i].setHeight(Float.parseFloat(tmpDetails[3]));
            container[i].setWeight(Double.parseDouble(tmpDetails[4]));
		}
		reader.close();
		System.out.format("Container details are\n%-20s %-15s %-15s %-15s %s\n","Container Number","Length","Width","Height","Weight");
		for(int i=0;i<n;i++){
            container[i].displayContainerDetails();
        }

	}

}
