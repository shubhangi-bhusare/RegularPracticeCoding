package com.juley27;

public class ReplaceWhiteSpaces {

	public static void main(String[] args) {
		String str="Shubhangi mahesh Navale";
		System.out.println("Original string is:\n"+str);
		char c='#';
		String str2=str.replace(' ', c);
		System.out.println("After Replacing-\n"+str2);
		

	}

}
