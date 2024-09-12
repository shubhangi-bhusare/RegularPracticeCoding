package practice;

public class CountImmediateClosingParenthesis {

//	[()()()] : output 3
//	(())()( : output 2
//	Give count of immediate closing parenthesis .
	public static void main(String[] args) {
		int cnt=0;
		String s="[()()()]";
		String s2="(())()(";
		for(int i=0;i<s.length()-1;i++)
		{
			if(s.charAt(i)=='(' && s.charAt(i+1)==')')
			{
				cnt++;
			}
		}
		System.out.println("Count is: "+cnt);

	}

}
