package com.juley27;

public class CountNoOfPunctuation {

	public static void main(String[] args) {
		String str="Shubh#an@gi!!";
		int cnt=0,cnt2=0;
		char c[]=str.toCharArray();
		for(int i=0;i<c.length;i++) {
			if(str.charAt(i)=='#' || str.charAt(i)=='@'|| str.charAt(i)=='!') {
				cnt++;
			}
			if(c[i]=='#'||c[i]=='@'||c[i]=='!')
			{
				cnt2++;
			}
		}
		System.out.println("Count is: "+cnt);
		System.out.println("Count by second way: "+cnt2);
	}

}
