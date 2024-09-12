package com.app.java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class findNoOfOccurance {
	public static void main(String[] args) {
		String arr[]= {"aa","bb","cc","ac","ac","aa","ac","bc","ac","bb"};
		
		//It counts the number of occurances of all elements
		Map<String, Long> map=Arrays.stream(arr).
				collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(map);
		
		
		//directly print duplicate elements
		Arrays.stream(arr).
		collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet()
		.stream().filter(i->i.getValue()>1)
		.forEach(i->System.out.print(i.getKey()+" "));
		
		
		//when functions return type is list then need to collect in list format
		List<String> list=Arrays.stream(arr).
				collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
				.entrySet().stream().filter(i->i.getValue()>1l)
				.map(e->e.getKey()).collect(Collectors.toList());
		       System.out.println();
               System.out.println("List is: "+list);  
               
               
        //Find Most occuring value
//               List<String> 
              String list2=Arrays.stream(arr).
       				collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
       				.entrySet().stream()
       	            .max(Map.Entry.comparingByValue())
       				.map(e->e.getKey()).get();
       		       System.out.println();
                   System.out.println("Most occuring string is: "+list2);  
                      
               System.out.println("-----------BY USING SET-------------------");
               Set<String> set=new HashSet<String>();
               Arrays.stream(arr).filter(i->!set.add(i)).distinct().forEach(i->System.out.print(i+" "));
		
	
	}
}
