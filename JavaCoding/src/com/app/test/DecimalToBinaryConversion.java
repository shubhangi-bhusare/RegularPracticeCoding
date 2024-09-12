package com.app.test;

public class DecimalToBinaryConversion {

	public static void main(String[] args) {
		int decimal=29;
		String binary="";
		while(decimal>0)
		{
			int rem=decimal%2;
			binary=binary+rem;
			decimal=decimal/2;
		}
		System.out.println("Binary conversion is: "+binary);

	}

}
