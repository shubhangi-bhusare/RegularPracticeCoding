package com.strDay1;

import java.util.Scanner;

public class CountTotalNoOfPunctuationMarks {
	public static int cnt=0;
	public static void main(String[] args) {
		//3) Java Program to count the total number of punctuation characters exists in a String
		
		 Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();//hii! shubhangi here #$@
			//	char[]ch=str.toCharArray();
		
		for(int i=0;i<str.length();i++)
		{
//			if(ch[i]=='!'||ch[i]=='@'||ch[i]=='#'||ch[i]=='*')
//			{
//				System.out.println(ch[i]);
//				cnt++;
//			}
			
			if(str.charAt(i)=='!'|| str.charAt(i)=='@' || str.charAt(i)==',' ||str.charAt(i)==';')
			{
				System.out.println(str.charAt(i));
				cnt++;
			}
		}
		System.out.println("Count is: "+cnt);

	}

}
