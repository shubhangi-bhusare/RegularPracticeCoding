package com.strDay1;
import java.lang.*;
import java.util.*;
public class Strings {

	public static void main(String[] args) {
		//display the character which is on Odd position
		String str="welcome to cdac";
		int strLength=str.length();
		System.out.println(strLength);
		for(int i=0;i<strLength-1;i++)
		{
			if(i%2!=0)
			{
				System.out.println(str.charAt(i));
			}
		}

	}

	
}
