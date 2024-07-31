package String14thmay;

import java.util.Scanner;

public class ReverseWordStringWithoutUsingReverseFunction {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		revStr(str);

	}
	public static void revStr(String str)
	{
		String res=" ";
		for(int i=str.length()-1;i>=0;--i)
		{
			res=res+(str.charAt(i));
		}
		System.out.println(res);
	}

}
