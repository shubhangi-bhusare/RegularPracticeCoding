package com.juley27;

import java.util.Scanner;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Choice-\n1.Remove white spaces \n2.Remove special characters");
		int ch;
		do {
			 ch=sc.nextInt();
			switch(ch) {
			case 1:
				String str="Shubhangi manik bhusare";
				String p=" ";
				str=str.replaceAll(p,"");
				System.out.println("String after removal of white spaces: \n"+str);
				break;
			case 2:
				String s1="Hello, World! This is a @test# string with $pecial characters. 99";
				String p1="[^a-zA-z0-9 ]";
				s1=s1.replaceAll(p1,"");
				System.out.println("String after Removal of special characters: \n"+s1);
				break;
			}
		}while(ch!=3);
		
	}

}
