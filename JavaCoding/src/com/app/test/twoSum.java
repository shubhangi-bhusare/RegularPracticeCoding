package com.app.test;

public class twoSum {
	public static int[] twoSum(int arr[],int target)
	{
		int ret[]=new int[2];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]+arr[j]==target)
				{
					ret[0]=i;
					ret[1]=j;
				}
			}
		}
		return ret;
	}
	
	public static void main(String[] args) {
		int arr[]= {12,2,3,3,4,6,5};
		int arr3[]=twoSum(arr,6);
		for(int i:arr3)
		{
			System.out.println(i);
		}
	}

}
