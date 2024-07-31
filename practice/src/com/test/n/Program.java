package com.test.n;

import java.util.Arrays;
import java.util.stream.Stream;

public class Program {
	public static void main(String[] args) {
//		Input ARRAY1 = 1,2,3,4
//		          ARRAY2 = 4,5,6,7,8,9,10
//		Output - Array3 = 1,2,3,4,5,6,7,8,9,10
		
		Integer[] arr= {1,2,3,4};
		Integer[] arr1= {4,5,6,7,8,9,10};
		
		Stream.concat(Arrays.stream(arr),Arrays.stream(arr1)).distinct().forEach(System.out :: print);
	}
}
// person name ,age ,add
//hashset