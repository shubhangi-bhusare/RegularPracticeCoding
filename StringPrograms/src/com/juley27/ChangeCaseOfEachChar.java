package com.juley27;

public class ChangeCaseOfEachChar {

	public static void main(String[] args) {
		String str="Shubhangi Navle";
		StringBuilder s=new StringBuilder(str);
		for(int i=0;i<str.length();i++) {
			if(Character.isUpperCase(str.charAt(i))) {
				s.setCharAt(i,Character.toLowerCase(str.charAt(i)));
			}else {
				s.setCharAt(i,Character.toUpperCase(str.charAt(i)));
			}
		}
		System.out.print("After conversion: "+s);
	}

}
