package com.test.n;

import java.util.Arrays;

public class Practice11 {
	public static void main(String[] args) {
		String arr[] = { "A", "A", "B", "C", "C", "D", "E", "B", "A", "A", "D", "D", "C", "B" } ;
//		print only non consicuteve elements
//				   output array is : {A,B,C,D,E,B,A,D,C,B}
		int len=arr.length;
		String str=arr[0];
		String[] arr1 = new String[len] ;
		int cnt=0;
		for(int i=1;i<arr.length;i++) {
			
			if(!str.equals(arr[i])) {
//				System.out.println(arr[i]);
				arr1[cnt]=arr[i];
				str=arr[i];
			}else {
//				System.out.println(str);
				arr1[cnt]=str;
				str=arr[i];
			}
			cnt++;
			
		}
		
		for(String st :arr1) {
			System.out.print(st);
		}
//		 Arrays.sort(arr);
//		List<String>
	}

}
