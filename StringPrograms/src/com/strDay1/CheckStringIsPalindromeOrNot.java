package com.strDay1;

public class CheckStringIsPalindromeOrNot {

	public static void main(String[] args) {
		//13) Java Program to determine whether a given string is palindrome
		String str="layal";
		String res="";
		for(int i=str.length()-1;i>=0;i--)
		{
			res=res+str.charAt(i);
		}
		System.out.println(res);
		System.out.println(str);
		if(res.equals(str))
		{
			System.out.println("String is palindrome");
		}
		else {
			System.out.println("String is not  palindrome");
		}
		

	}

}
