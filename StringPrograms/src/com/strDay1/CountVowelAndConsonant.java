package com.strDay1;

public class CountVowelAndConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//4) Java Program to count the total number of vowels and consonants in a string
		String str="Shubhangi";
		char[] ch=str.toCharArray();
		int cntVowel=0;
		int cntConsonant=0;
		for(int i=0;i<str.length();i++)
		{
			if( ch[i]=='a' || ch[i]=='e' || ch[i]=='i'|| ch[i]=='o' || ch[i]=='u') 
			{
				cntVowel++;
			}
			else {
				cntConsonant++;
			}
		}
		System.out.println("Count of vowels is: "+cntVowel);
		System.out.println("Count of Consonants is: "+cntConsonant);

	}

}
