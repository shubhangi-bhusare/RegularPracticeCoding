package com.strDay1;

import java.util.Arrays;
import java.util.Scanner;

public class CheckTwoStringsAreAnagramOrNot {

	public static void main(String[] args) {
		// Two Strings are called the anagram if they contain the 
		//same characters. However, the order or sequence of the characters can be different.
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string 1 and string 2");
       String str1=sc.next();
       String str2=sc.next();
       
       String s1=str1.toLowerCase();
       String s2=str2.toLowerCase();
       if(s1.length()!=s2.length())
       {
    	   System.out.println("Strings are not anagram becoz there length is different");
       }
      else {
    	   char[] ch1=s1.toCharArray();
    	   char[] ch2=s2.toCharArray();
    	   Arrays.sort(ch1);
    	   Arrays.sort(ch2);
    	   System.out.println("Check equality");
    	   
    	   //**To check if two char arrays are equal or not in Java, you can use the Arrays.equals() method from the java.util package. 
    	   boolean flag=Arrays.equals(ch1, ch2);
    	   if(flag==true)
    	   {
    		   System.out.println("strings are anagram");
    	   }
    	   else {
    		   System.out.println("Strings are not anagram");
    	   }
    	   //
//    	   System.out.println(ch1);
//    	   System.out.println(ch2);
    	   //below logic is NOT WORK and also equals() method is NOT WORK
//    	   if(ch1==ch2)
//    	   {
//    		  System.out.println("Strings are Anagram"); 
//    	   }
//    	   else {
//    		   System.out.println("Strings are not Anagram");
//    	   }
       }
	}

} 