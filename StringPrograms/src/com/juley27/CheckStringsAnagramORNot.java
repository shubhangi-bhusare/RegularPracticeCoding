package com.juley27;

import java.util.Arrays;
import java.util.Scanner;

public class CheckStringsAnagramORNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string 1");
		String str1=sc.next();
		System.out.println("Enter string 2");
		String str2=sc.next();
		if(str1.length()!=str2.length()) {
			System.out.println("Strings are not anagram becoz of length!!!");
		}
		String s1=str1.toLowerCase();
		String s2=str2.toLowerCase();
		String []ss1=s1.split("");
		String []ss2=s2.split("");
//		char []ss1=s1.toCharArray();
//		char []ss2=s2.toCharArray();
		Arrays.sort(ss1);
		Arrays.sort(ss2);
		boolean flag=Arrays.equals(ss1, ss2);
		if(flag==true)
		{
			System.out.println("Strings are anagram!!!");
		}else {
			System.out.println("Strings are not anagram!!");
		}
		

	}

}
