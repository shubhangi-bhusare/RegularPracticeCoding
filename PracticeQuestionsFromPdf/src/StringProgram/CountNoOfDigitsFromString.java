package StringProgram;

public class CountNoOfDigitsFromString {

	public static void main(String[] args) {
		String s="sh12!sfe5g64";
//		int ss=3864;
//		String ss1=String.valueOf(ss);
//		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(Character.isDigit(s.charAt(i)))
			{
				System.out.print(s.charAt(i)+" ");
//				count++;
			}
		}
//		System.out.println(count);

	}

}
