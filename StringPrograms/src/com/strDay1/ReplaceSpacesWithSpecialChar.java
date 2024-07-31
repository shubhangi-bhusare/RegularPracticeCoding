package com.strDay1;

public class ReplaceSpacesWithSpecialChar {

	public static void main(String[] args) {
		// Java Program to replace the spaces of a string with a specific character
		String str="hello i am shubhangi !";
		char ch = '-';
		//use replace function on above string
		str = str.replace(' ',ch);
		System.out.println("After replacing the character with white spaces");
		System.out.println(str);

	}

}
