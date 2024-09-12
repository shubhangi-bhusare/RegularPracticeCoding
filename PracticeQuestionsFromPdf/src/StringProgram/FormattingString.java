package StringProgram;

public class FormattingString {

	//WRONG 
//	Java program to gives Output:
//		“00003241212” for the Input
//		String Str = “32400121200”
	public static void main(String[] args) {
		String Str = "32400121200";
		String FormatString=Str.format("%011d",Long.parseLong(Str));
		System.out.println("after format: "+FormatString);
		

	}

}
