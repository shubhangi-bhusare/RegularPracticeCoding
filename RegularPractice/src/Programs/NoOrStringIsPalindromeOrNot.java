package Programs;

import java.util.Scanner;

public class NoOrStringIsPalindromeOrNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string/Number");
	
		String str=sc.next();
		String res="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			 res=res+str.charAt(i);   
		}
		System.out.println(res);
		System.out.println(str);
      if(res.equals(str))
      {
    	  System.out.println("String/Number is palindrome ");
      }
      else
      {
    	  System.out.println("String/Number is not palindrome");
      }
		
	}

}
