package com.strDay1;

public class RemoveWhiteSpaces {
 
	// Java Program to remove all the white spaces from a string
	
	public static void main(String[] args) {
		String str="remove white spaces ";
		str=str.replaceAll("\\s+","");
		System.out.println("after complete:"+str);
	}

}
