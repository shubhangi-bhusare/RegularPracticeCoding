package com.app.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DuplicateElementFind {

	public static void main(String[] args) {
		
		//1st way
		/*
		 * Integer[] arr= {2,4,6,3,2,4,1,5,4,3}; List<Integer> list=Arrays.asList(arr);
		 * Set<Integer> set=list.stream()
		 * .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		 * .entrySet().stream() .filter(entry->entry.getValue()>1)
		 * .map(Map.Entry::getKey) .collect(Collectors.toSet());
		 * //System.out.println(set); set.forEach(i->System.out.println(i));
		 */
		
		//entrySet--> Returns a set view of the mappings contained in this map
		
		
		//2nd way
		int arr[]= {2,3,1,2,6,9,3,2,3,1};
		List<Integer> lis=IntStream.of(2,3,1,2,6,9,3,2,3,1)
				.boxed()
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
				.entrySet()
				.stream()
				.filter(en->en.getValue()>1)
				.map(Map.Entry::getKey)
				.collect(Collectors.toList());
		System.out.println(lis);
		
		
		


	}

}
