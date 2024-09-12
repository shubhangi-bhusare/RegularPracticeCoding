package StringProgram;

public class ReverseVowelsOfString {
	public static String reverse(String str)
	{
		StringBuilder sb= new StringBuilder(str);
		int i=0;
		int j=str.length()-1;
		while(i<j)
		{
			char ch1=str.charAt(i);
			char ch2=str.charAt(j);
			if(ch1=='a'||ch1=='e'||ch1=='i'||ch1=='o'||ch1=='u')//also take capital vowels here
			{
				if(ch2=='a'||ch2=='e'||ch2=='i'||ch2=='o'||ch2=='u')
				{
					sb.setCharAt(i, ch2);
					sb.setCharAt(j, ch1);
					i++;
				}
				j--;
			}else {
				i++;
			}
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		String s="shubhangi";
		System.out.println(reverse(s));

	}

}
