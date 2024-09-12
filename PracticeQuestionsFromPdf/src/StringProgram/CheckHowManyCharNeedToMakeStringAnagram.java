package StringProgram;

public class CheckHowManyCharNeedToMakeStringAnagram {
	public static int check(String s)
	{
		String s1=s.substring(0,s.length()/2);
		String s2=s.substring(s.length()/2);
		if(s.length()%2!=0)
		{
			return -1;
		}
		for(char n: s1.toCharArray())
		{
			if(s2.indexOf(n)!=-1)
			{
				s2=s2.replaceFirst(String.valueOf(n), "");
			}
		}
		return s2.length();
	}
	public static void main(String[] args) {
		String s1="aaabbb";   //output should be 3 bbb->aaa(bbb need to convert in aaa
		String s2="abc";     //o/p=-1 becoz odd no so no possibility of anagram
		String s3="mnop";   //o/p : -2 becoz need to replace op with mn
		System.out.println(check(s1));
		System.out.println(check(s2));
		System.out.println(check(s3));
	}

}
