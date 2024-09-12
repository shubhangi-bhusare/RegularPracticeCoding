package StringProgram;

import java.util.HashSet;

public class LongestSubStringWithoutRepeatingChar {
	
	public static int LongestString(String str)
	{
		
		int len=0;

		for(int i=0;i<str.length();i++)
		{
			HashSet<Character> set=new HashSet<Character>();;
			for(int j=i;j<str.length();j++)
			{
				if(!set.contains(str.charAt(j)))
				{
					set.add(str.charAt(j));
				}else {
					break;
				}
				 len=Math.max(len, set.size());
			}
			
		}
		return len;

	}

	public static void main(String[] args) {
		String s="abcabcacdss";
		System.out.println(LongestString(s));

	}

}
