package com.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ArrayListExample {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(12,13,32,12,33,43,33,12,45,65,33);
		list.stream().map(i->i+"").filter(str->str.startsWith("1")).forEach(System.out::println);
		//1.even no 2.odd 3.sort 4.max 5.min 6.duplicate remove 7.store list in other list
		System.out.println("even elements");
		list.stream().filter(i->i%2==0).forEach(System.out::println);
		System.out.println("Odd elements");
		list.stream().filter(i->i%2!=0).forEach(System.out::println);
		System.out.println("sorted elements");
		list.stream().sorted().forEach(System.out::println);
		System.out.println("max number");
		Integer max=list.stream().max(Integer::compareTo).get();
		System.out.println(max);
		System.out.println("Min number");
		Integer min=list.stream().min(Integer::compareTo).get();
		System.out.println(min);
		System.out.println("conversion of ouput in other list");
		List<Integer>list1=list.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(list1);
		System.out.println("Remove duplicates by converting it into set");
		Set<Integer>set=list.stream().collect(Collectors.toSet());
		System.out.println(set);
		
		
	}
}
