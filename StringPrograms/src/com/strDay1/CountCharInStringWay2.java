package com.strDay1;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountCharInStringWay2 {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
        String str="shubhangibhusare";
       // String str2[]=str.split("");
        int count=0, count1=0;
        for(int i=0;i<str.length();i++)
        {
        	if(str.charAt(i)=='s')
        	{
        		count++;
        	}
        	else if(str.charAt(i)=='h')
        	{
        		count1++;
        	}
        	
        }
        System.out.println("count of s is "+count);
        System.out.println("count of h is "+count1);
     
        
        
        //2nd way
		String[] str1=str.split("");
		Map<String,Long>map=Arrays.stream(str1).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(map);
	}

}
