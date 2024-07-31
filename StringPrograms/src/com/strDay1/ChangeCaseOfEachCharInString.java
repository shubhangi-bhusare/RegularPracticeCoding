package com.strDay1;

public class ChangeCaseOfEachCharInString {

	public static void main(String[] args) {
		//11) Java Program to replace lower-case characters with upper-case and vice-versa
		//convert string into stringBuilder
		String str="Great Power";
		StringBuilder sb =new StringBuilder(str);
		//check the case and convert it
		for(int i=0;i<str.length();i++)
		{
			//Check that if uppercase then convert into lowercase
			//here SetChatAt method is present in SB so we can easily converted in to other case
			if(Character.isUpperCase(str.charAt(i)))
			{
				sb.setCharAt(i,Character.toLowerCase(str.charAt(i)));//2 arguments in the setCharAt method 1st is index and second is actual character
			}
			else if(Character.isLowerCase(str.charAt(i)))
			{
				sb.setCharAt(i,Character.toUpperCase(str.charAt(i)));
			}		
		}
		System.out.println("Converted string is:"+sb);
		

	}

}
