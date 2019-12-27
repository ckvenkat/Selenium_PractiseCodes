package com.oops.concepts;

import java.util.Scanner;

class calculation {
	  int sum;
	
	public void additionofnumbers(int x,int y){
		sum = x + y;
		System.out.println("additionofnumbers is:" + "" + sum); 
	}
	
	public void additionofnumbers(int x, int y, int z) {
		sum = x + y + z;
		System.out.println("additionofnumbers is:" + "" + sum); 
	}

	public void subtractionofnumbers(int x, int y) {
		sum = x - y;
		System.out.println("subtractionofnumbers is:" + "" + sum); 
	}

	public void multiplicationofnumbers(int x, int y) {
		sum = x * y;
		System.out.println("multiplicationofnumbers is:" + "" + sum); 
	}

}

public class mathCalculations extends calculation {

	public void divisionofnumbers(int x, int y) {
		sum = x / y;
		System.out.println("divisionofnumbers is:" + "" + sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c;
		System.out.println("Enter numbers");
		Scanner in = new Scanner(System.in); 
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();
		mathCalculations math = new mathCalculations();
		math.additionofnumbers(a,b);
		math.additionofnumbers(a, b, c);
		math.subtractionofnumbers(a, b);
		math.multiplicationofnumbers(a, b);
		math.divisionofnumbers(a, b);
		in.close();

	}

}
