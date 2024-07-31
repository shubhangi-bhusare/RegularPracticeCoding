package com.practice;

//The Next greater Element for an element x is the first greater element on the right side of x in the array. Elements for which no greater element exist, consider the next greater element as -1. 
//
//Example: 
//
//Input: arr[] = [ 4 , 5 , 2 , 25 ]
//Output:  4      –>   5
//               5      –>   25
//               2      –>   25
//              25     –>   -1

public class Array2Program {

	public static void main(String[] args) {
		int arr[]= {12,3,4,14,13};
		for(int i=0;i<arr.length;i++)
		{
			int next=-1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					next=arr[j];
					break;
				}
			}
			System.out.println(arr[i]+"------>"+next+" ");
		}

	}

}
