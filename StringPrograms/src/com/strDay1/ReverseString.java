package com.strDay1;

public class ReverseString {

	public static void main(String[] args) {
		String str="TajMahal";
		char[] ch=str.toCharArray();
		for(int i=str.length()-1;i>=0;i--)
		{
			System.out.print(ch[i]+" ");
		}
		
	}
	
	
}
