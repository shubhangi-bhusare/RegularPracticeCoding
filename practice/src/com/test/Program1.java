package com.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Program1 {

	public static void main(String[] args) {
		
//		List<String> list=Arrays.asList("10","20","10","20","30","40","40");
////		Set<String> set=new HashSet();
//		Map<String ,Long> map= list.stream().filter(i -> Collections.frequency(list, i) >1)
////				.filter(num -> !set.add(num))
//				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//		
//		System.out.println(map);
		
		
		String s1="mahesh balasaheb navale";
		String[] arr=s1.split(" ");
		
		for(String str : arr) {
			System.out.println(str.substring(0, 1));
		}

	}

}
