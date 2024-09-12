package com.app.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateincludingThatElemItself {

	public static void main(String[] args) {
		int[] array = {1, 1, 2, 2, 3, 4, 5, 5, 6, 6};
		List<Integer> list=Arrays.asList(1,1,2,2,3,4,5,5,6,6);
		List<Integer> resList=
				list.stream()
				.filter(i->Collections.frequency(list,i)==1)
				.collect(Collectors.toList());
		System.out.println(resList);
		
		//Another way
		
		for(int i=0;i<array.length;i++)
		{
			int cnt=0;
			for(int j=0;j<array.length;j++)
			{
				if(array[i]==array[j] && i!=j)
				{
					cnt++;
//					break;
				}
			}
			if(cnt==0)
			{
				System.out.println(array[i]);
			}
		}
	}

}
