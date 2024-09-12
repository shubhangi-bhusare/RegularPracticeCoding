package RegularPractice;

import java.util.HashSet;

public class LongestSubstringWithoutDup {

	public static void main(String[] args) {
		String str="shubhangihhh";//ubhangi this should be output becoz it doesn't have repeated character
		int len=0;
		
		for(int i=0;i<str.length();i++)
		{
			HashSet<Character> set=new HashSet<Character>();
			for(int j=i;j<str.length();j++)
			{
				if(!set.contains(str.charAt(j)))
				{
					set.add(str.charAt(j));
				}else {
					break;
				}
				
			}
			len=Math.max(len, set.size());
			System.out.println(set);
			
		}
		System.out.println(len);
//		System.out.println(set);

	}

}
