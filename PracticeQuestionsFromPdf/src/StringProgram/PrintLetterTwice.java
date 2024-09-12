package StringProgram;

public class PrintLetterTwice {

	public static String printTwice(String s)
	{
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			sb=sb.append(ch).append(ch);
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		String str="Shubhangi";
		System.out.println(printTwice(str));

	}

}
