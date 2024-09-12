package com.practice;

public class arrayProgram
{
//	Given an array of n elements that contains elements from 0 to n-1, with any of these numbers appearing any number of times.
	//Find these repeating numbers in O(n) and use only constant memory space.
//
//	Note: The repeating element should be printed only once.
//
//	Example: 
//
//	Input: n=7 , array[]={1, 2, 3, 6, 3, 6, 1}
//	Output: 1, 3, 6
//	Explanation: The numbers 1 , 3 and 6 appears m
	public static void main(String[] args)
	{
		int arr[]={1,2,5,3,3,6,3,8,8,8,6,1};
		
//		for(int i=0;i<arr.length;i++)
//		{
//			int count=0;
//			for(int j=i+1;j<arr.length;j++)
//			{
//				if(arr[i]==arr[j] && i!=j)
//				{
//					count++;				
//				}
//				
//			}
//			if(count==0)
//			{
//				System.out.print(arr[i]+" ");
//			}
//		}
		int j=1;
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]!=arr[j-1])
			{
				arr[j]=arr[i];
				j++;
			}
		}
		System.out.println(j);
	}
	 
	
	
}
