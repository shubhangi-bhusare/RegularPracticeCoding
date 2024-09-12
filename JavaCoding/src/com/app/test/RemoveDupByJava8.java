package com.app.test;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDupByJava8 {

	public static void main(String[] args) {
		int arr[]= {0,0,1,1,1,2,2,3,3,4};
		Arrays.stream(arr).distinct().forEach(System.out::println);
		
		System.out.println("By use of Hashset remove duplicates are: ");
		int j=0;
		HashSet<Integer> set=new HashSet<Integer>();
		for(int i=0;i<arr.length;i++)
		{
			if(!set.contains(arr[i]))
			{
				set.add(arr[i]);
				j++;
			}
		}
		System.out.println(set);
		System.out.println(j);

	}

}
