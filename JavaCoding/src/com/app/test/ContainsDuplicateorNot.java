package com.app.test;

import java.util.HashMap;
import java.util.HashSet;

public class ContainsDuplicateorNot {
	public static boolean containsDuplicate(int arr[])
	{
		HashSet<Integer> set=new HashSet<Integer>();
		for(int i:arr)
		{
			if(!set.add(i))
			{
				return true;
			}
		}
		return false;
	}
	
	
	public static boolean containsNearByDupl(int arr1[],int k)
	{
		HashMap<Integer,Integer> map=new HashMap<Integer, Integer>();
		for(int i=0;i<arr1.length;i++)
		{
			if(map.containsKey(arr1[i]))
			{
				int pre=map.get(arr1[i]);
				if(i-pre<=k)
				{
					return true;
				}
			}
				map.put(arr1[i],i);
				
		}
		return false;
				
	}
	public static void main(String[] args) {
		int arr[]= {1,3,4,6,7,8,9,10};
		System.out.println(containsDuplicate(arr));
		System.out.println(containsNearByDupl(arr, 10));
	}

}
