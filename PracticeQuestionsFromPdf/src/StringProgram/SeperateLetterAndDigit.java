package StringProgram;

public class SeperateLetterAndDigit {
	
//	17.) Java program to gives two Output:
//		“Subburaj”, “123” for the Input
//		String Str = “Subbu123raj”
	
	public static void Seperate(String s)
	{
		StringBuilder letter=new StringBuilder();
		StringBuilder digit=new StringBuilder();
		char ch[]=s.toCharArray();
		for(char c: ch)
		{
			if(Character.isLetter(c))
			{
				letter.append(c);
			}else {
				digit.append(c);
			}
		}
		System.out.println("Letter is: "+letter);
		System.out.println("Digit is: "+digit);
	}
	public static void main(String[] args) {

		String str="shu26bh634hjdfgj";
		Seperate(str);

	}

}
