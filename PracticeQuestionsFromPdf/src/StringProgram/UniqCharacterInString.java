package StringProgram;

public class UniqCharacterInString {
	
	public static void UniqueChar(String str)
	{
		// Assume ASCII characters (0-127), use boolean array to track
//		character occurrences
		boolean uniq[]=new boolean[128];
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(!uniq[ch])
			{
				uniq[ch]=true;
				System.out.print(ch+" ");
			}
		}
		
	}
	public static void main(String[] args) {
		String s="Hello world";
		UniqueChar(s);

	}

}
