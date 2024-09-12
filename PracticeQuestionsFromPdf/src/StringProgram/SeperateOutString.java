package StringProgram;

public class SeperateOutString {

	//Java program to gives two Output:
//	“abcde”, “ABCDE” for the Input
//	String Str = “aBACbcEDed”
	public static void Seperate(String s)
	{
		StringBuilder upper=new StringBuilder();
		StringBuilder lower=new StringBuilder();
		char arr[]=s.toCharArray();
		for(char ch:arr)
		{
			if(Character.isLowerCase(ch))
			{
				lower.append(ch);
			}else
			{
				upper.append(ch);
			}
		}
		System.out.println(lower.toString());
		System.out.println(upper.toString());
	}
	public static void main(String[] args) {
		String s="AbCdDEecBa";
		Seperate(s);

	}

}
