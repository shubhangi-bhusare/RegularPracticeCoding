package com.app.test;

public class twoSumInSortedArray {
	public static int[] twoSum(int arr[],int target)
	{
		if(arr ==null ||arr.length==0)
		{
			return null;
		}
		int left=0;
		int right=arr.length-1;
		while(left<right)
		{
			int x=arr[left]+arr[right];
			if(x<target)
			{
				left++;
			}else if(x>target)
			{
				right--;
			}else {
				return new int[] {left,right};
			}
		}
		return null;
	}
	public static void main(String[] args) {
		int arr[]= {1,3,4,6,7,8,10};
		int arr2[]=twoSum(arr,10);
		for(int i:arr2)
		{
			System.out.println(i);
		}
	}

}
