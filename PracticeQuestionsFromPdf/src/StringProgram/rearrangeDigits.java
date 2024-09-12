package StringProgram;

public class rearrangeDigits {

//	18.) Java program to gives Output:
//		“32412120000” for the Input
//		String Str = “32400121200”

	public static String rearrangeDigits(String s)
	{
		StringBuilder digit=new StringBuilder();
		StringBuilder nondigit=new StringBuilder();
		char ch[]=s.toCharArray();
		for(char c: ch)
		{
			if(Character.isDigit(c))
			{
				digit.append(c);
			}else {
				nondigit.append(c);
			}
		}
		return digit.toString()+nondigit.toString();
	}
	public static void main(String[] args) {
		String str="324oo1212oo";
		System.out.println(rearrangeDigits(str));

	}

}
