package com.strDay1;

public class FindLongestRepeatingSequenceString {

	//8) Java Program to find the longest repeating sequence in a string
	public static String lcp(String s,String t)
	{
		int n=Math.min(s.length(), t.length());
		for(int i=0;i<n;i++)
		{
			if(s.charAt(i)!=t.charAt(i))
			{
				return s.substring(0,i);
//				System.out.println("First ST"+ "  "+  s.substring(0,i));
			}
			
		}
		return s.substring(0, n);
//		System.out.println("last st"+"  "+s.substring(0,n));
	}
	

	
	public static void main(String[] args) {
		String str="abdfwesdbdfv";
		String lrs="";
		int len=str.length();

		int count=0;
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				
//				lcp(str.substring(i, len),str.substring(1, len));
//				count++;
				String x=lcp(str.substring(i, len),str.substring(j+1, len));
				if(x.length()> lrs.length())
					lrs=x;
				count++;
			}
		}
		System.out.println("Largest Repeating sub String is: "+lrs);
		System.out.println("Count"+count);

	}

}
