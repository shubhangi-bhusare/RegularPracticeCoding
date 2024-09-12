package com.app.test;

public class FirstOccuranceOfSubstring {
	public static int strstr(String hystack,String needle)
	{
		
		if(hystack.length()<needle.length())
		{
			return -1;
		}
		
		for(int i=0;i<hystack.length()-needle.length();i++)
		{
			if(hystack.substring(i, i+needle.length()).equals(needle))
			{
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		String hystack="sadbutsadbysad";
		String needle="sad";
		System.out.println(strstr(hystack, needle));//give the index of sad

	}

}
