package com.juley27;

public class CheckStringRotationOrNot {

	public static void main(String[] args) {
		String str1="abcdef";
		String str2="defabc";
		if(str1.length()!=str2.length()) {
			System.out.println("String1 is not rotation of string2 becoz of length!!");
		}else {
		String str3=str1.concat(str1);
		if(str3.indexOf(str2)!=-1) 
		{
			System.out.println("String1 is rotation of string2!!");
		}else {
			System.out.println("Not rotation!!!");
		}

	}
	}

}
