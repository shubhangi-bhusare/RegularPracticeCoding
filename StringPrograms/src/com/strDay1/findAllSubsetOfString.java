package com.strDay1;

public class findAllSubsetOfString {

	//7) Java Program to find all subsets of a string

//	9) Java Program to find all the permutations of a string
//	10) Java Program to remove all the white spaces from a string
	
	
	public static void main(String[] args) {
		String str="FUNQ";
		int len=str.length();
		int temp=0;
		
		String arr[]= new String[len*(len+1)/2];  //len*(len+1)/2 is formula to print all possible substring
		//loop for dividing starting character
		for(int i=0;i<len;i++)
		{
       //This loop adds the next character every iteration for the subset to form and add it to the array 
			for(int j=i;j<len;j++)
			{
				arr[temp]=str.substring(i,j+1);//i=startposition j+1=endposition
				temp++;
			}
		}
		System.out.println(temp);
		System.out.println("String subparts are");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
//		String str="FUNQ";
//		int len=str.length();
//		int temp=0;
//		String arr[]=new String[len*(len+1)/2];
//		for(int i=0;i<str.length();i++)
//		{
//			for(int j=i;j<str.length();j++)
//			{
//				arr[temp]=str.substring(i,j+1);
//				temp++;
//			}
//		}
//		for(int i=0;i<arr.length;i++)
//		{
//			System.out.println(arr[i]);
//		}
		
	}

}
