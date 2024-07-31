package com.test.n;

import java.util.Arrays;
import java.util.List;

public class numberStartWithOne {
	public static void main(String[] args) {

		
		
//		Given a list of integers, find out all the numbers starting with 1 using Stream functions?
		
		List<Integer> list=Arrays.asList(10,20,23,24,14,16);
		
		list.stream().map(num -> num +"").filter(str ->str.startsWith("1")).forEach(System.out::println);
		
	}
}

// select ename from employee Order by salary DESC limit(2,1);

// select Max(salary) from employee where salary<(select max(salary))
 

 

