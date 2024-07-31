package RegularPractice;

import java.util.Scanner;

public class ConvertLowercaseToUpperCase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		char c='0';   //if we want to intialize any char variable with no value the do like this
		//String str1=str.toLowerCase();
		//Iterate over the String to convert into Lowercase
		StringBuilder newstr=new StringBuilder();
		for(int i=0;i<str.length();i++)
		{
			 c=str.charAt(i);
			if(c >='A'&&c<='Z')
			{
				c=(char)(c+32);//The difference between the ASCII values of corresponding uppercase and lowercase letters is 32. 
									//For example:'A' (65) and 'a' (97): 97 - 65 = 32
				//If ch is an uppercase letter, adding 32 to its ASCII value converts it to the corresponding lowercase letter. For example:
				//If ch is 'A' (65), then ch + 32 is 97, which is 'a'.

			}
			else if(c>='a'&&c<='z')
			{
				c=(char)(c-32);
			}
			newstr.append(c);//StringBuilder append method is use here becoz we need to store the character
			System.out.print(c);//here we directly sstore in c char variable which is initialize with 0 value
		}
		System.out.println();
		System.out.println("Output by StringBuilder vari use: "+newstr);
		
	}

}
