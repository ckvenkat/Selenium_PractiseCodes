package com.oops.concepts;

public class Constructors {
	int sum, a, b;

	Constructors(int x, int y) {
		a = x;
		b = y;
	}

	void sum() {
		sum = a + b;
		System.out.println(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructors s1 = new Constructors(20, 25);
		s1.sum();
	}

}
