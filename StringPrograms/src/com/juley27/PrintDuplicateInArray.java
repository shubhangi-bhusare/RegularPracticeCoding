package com.juley27;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PrintDuplicateInArray {

	public static void main(String[] args) {
		int arr[]= {4,3,2,4,6,7,5,5,5,2,1,6};
		
		HashSet<Integer> set=new HashSet<Integer>();//give uniq elements
		
		
		
		//when return type is list
		List<Integer> list= Arrays.stream(arr).boxed().filter(i->!set.add(i)).distinct().collect(Collectors.toList());
		System.out.println(list);
		
		
		
		//convert in array when return type is array
		int a[]=list.stream().mapToInt(Integer::intValue).toArray();
		for(int i:a)
		{
			System.out.println(i);
		}
	
		
		 Map<Integer, Long> map=Arrays.stream(arr).boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
	}

}
