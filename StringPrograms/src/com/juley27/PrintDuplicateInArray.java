package com.juley27;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;

public class PrintDuplicateInArray {

	public static void main(String[] args) {
		int arr[]= {4,3,2,4,6,7,5,5,2,1,6};
		
		HashSet<Integer> set=new HashSet<Integer>();
		Arrays.stream(arr).filter(i->!set.add(i)).forEach(i->System.out.println(i));
		//OR
//		for(int i=0;i<arr.length;i++) {
//			for(int j=i+1;j<arr.length;j++) {
//				if(arr[i]==arr[j]) {
//					System.out.print(arr[i]+" ");
//				}
//			}
//		}
		
	}

}
