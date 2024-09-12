package com.app.test;

import java.util.Arrays;

public class SecondLargestElement {
	
	public static void main(String[] args) {
		int arr[]= {1,3,71,70,5,2,7,22,44,66,56,36};
		Arrays.sort(arr);
		System.out.println(arr[arr.length-2]);
		
		//sorting of array
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		//Display array after sorting
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
