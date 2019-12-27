package com.practisecodes;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i,j;
		for (i=1;i<=100;i++) {
			j=i%2;
			if (j==0)
			{
				System.out.println(i + " " +"Even Number");
			}else
			{
				System.out.println(i + " " +"Odd Number");
			}
		}

	}

}
