package StringProgram;

public class CountVowelsAndConsonent {

	public static void CountVowAndConsonent(String s)
	{
		int vowel=0;
		int cons=0;
		s=s.toLowerCase();
		char[] arr=s.toCharArray();
		for(char c:arr)
		{
			if(c>='a' &&  c<='z')
			{
				if(c=='a' || c=='e'||c=='i' || c=='o'||c=='u')
				{
					vowel++;
				}else {
					cons++;
				}
			}
		}
		
		System.out.println("Vowels are: "+vowel);
		System.out.println("Consonants are: "+cons);
		
	}
	public static void main(String[] args) {
		String str="Hello world";
		CountVowAndConsonent(str);

	}

}
