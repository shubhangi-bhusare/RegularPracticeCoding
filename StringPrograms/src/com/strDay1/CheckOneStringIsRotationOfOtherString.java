package com.strDay1;

public class CheckOneStringIsRotationOfOtherString {
	
//	14) Java Program to determine whether one string is a rotation of another
	public static void main(String[] args) {
		String str1="abcde";//abcdeabcde
		String str2="deabc";
		//firstly we check the length of them which should be equal
		int a=str1.length();
		int b=str2.length();
		if(a!=b)
		{
			System.out.println("String2 is not rotation of string1 becoz of their length");
		}
		else
		{
			String res=str1.concat(str1);//abcdeabcde
			System.out.println("concatenated string is: "+res);
			if(res.indexOf(str2)!=-1)
			{
				System.out.println("String2 is rotation of string1");
			}
			else
			{
				System.out.println("String2 is not rotation of string1");
			}
		}
		

	}

}
