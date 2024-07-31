package com.test;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class sortString {
	public static void main(String[] args) {
		String s1="abcbacabca";
//		output = "aaaabbbccc"
		
		String[] str=s1.split("");
		Map<String, Long> mapString=Arrays.stream(str).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
				System.out.println(mapString.size());
				Long set=mapString.get(mapString.keySet());
				System.out.println(set);
				for(int i=0;i<mapString.size();i++) {
					
					
//					for(int j=0;j<n;j++) {
//						
//					}
				}
				
				
				
//				((Stream<String>) mapString.entrySet()).map(Map.Entry<mapString.get, V> :: getValue).
		
//		char[] str=s1.toCharArray();
////	
//		char prv;
//		StringBuilder st =new StringBuilder()	;
//		for(int i=0;i<str.length;i++) {
//			
//			st=st.append(str[i]);
//			for(int j=i+1 ;j<str.length;j++) {
//				if(str[i] ==str[j]) {
//					st=st.append(str[j]);
//				}
//			}
//			
//		}
//		System.out.println(st.toString());
		
//		sortString(str);
	}
	
	

}
