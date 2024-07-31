package com.juley27;

public class GetMissingElement {
	public static int getMissingElement(int arr[],int n) 
	{
		int N=n+1;
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		int res=(N*(N+1)/2)-sum;
		return res;
		
	}
	public static void main(String[] args) {
		int arr[]= {2,1,3,5,6,4,8};
		int n=arr.length;
		int res=getMissingElement(arr,n);
		System.out.println("Missing element is: "+res);
	}

}
