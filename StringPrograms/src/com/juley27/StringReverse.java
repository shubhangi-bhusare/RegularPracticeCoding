package com.juley27;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter choice -\n1.Inbuild reverse function \n2.Reverse by Array"
				+ "\n3.Reverse Word");
		int ch;
		boolean flag=false;
		do {
			 ch=sc.nextInt();
			switch(ch) {
			case 1:
				String str="Shubhangi mahesh navale";
				StringBuilder st=new StringBuilder(str);
				System.out.println(st.reverse());
				break;
			case 2:
				String str2="Shubhangi bhusare";
				char [] arr=str2.toCharArray();
				String re="";
				for(int i=str2.length()-1;i>=0;i--) {
					re+=str2.charAt(i);
					char c=str2.charAt(i);
					System.out.print(c);
				}
				System.out.println();
				System.out.print(re);
				break;
			case 3:
				String str3="shubhangi#manik#bhusare";
				String arrr[]=str3.split("#");
				String res="";
				for(int i=arrr.length-1;i>=0;i--) {
					res+=arrr[i]+" ";
				}
				System.out.println(res);
				break;
			default:
				System.out.println("Default case!!");
				break;
			}
		}while(ch!=3);
		
	}

}
