package com.app.test;

public class SortBinaryArray {

	public static void SortBinaryArr(int arr[])
	{
		int low=0;
		for(int high=0;high<arr.length;high++)
		{
			if(arr[high]==0)
			{
				int temp=arr[low];
				arr[low]=arr[high];
				arr[high]=temp;
				low++;
			}
		}
	}
	public static void main(String[] args) {
		int arr[]= {0, 1, 0, 0, 1, 1, 1, 0};
		SortBinaryArr(arr);
		for(int i:arr)
		{
			System.out.println(i);
		}

	}

}
