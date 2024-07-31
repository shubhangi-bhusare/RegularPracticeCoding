package com.strDay1;

public class CountFrequency {

	public static void main(String[] args) {
		String str="welcome home";
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='e')
			{
				count++;
			}
			
		}
		System.out.println("The frequency of e in string is: "+count);

	}

}
