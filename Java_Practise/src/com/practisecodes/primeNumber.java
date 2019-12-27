package com.practisecodes;

public class primeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j;
		String primeNumbers = "";
		for (i = 1; i <= 100; i++) {
			int counter = 0;
			for (j = i; j >= 1; j--) {
				if (i % j == 0) {
					counter = counter + 1;
				}
			}
			if (counter == 2) {
				// Appended the Prime number to the String
				primeNumbers = primeNumbers + i + " ";
			}

		}
		System.out.println(primeNumbers);
	}
}
