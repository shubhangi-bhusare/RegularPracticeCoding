package com.juley27;

import java.util.Scanner;

public class TrianglePattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Choice-\n1.Right angle Triangle \n"
				+ "2.Downside Right angle Triangle \n"
				+ "3.EquiLateral Triangle \n"
				+ "4.Downside EquiLateral Triangle \n"
				+ "5.Diamond \n"
				+ "6.Parallelogram \n"
				+ "7.Opposite side parallelogram \n");
		int ch;
		do {
			 ch=sc.nextInt();
			switch(ch) {
			case 1:
				int num1=6;
				for(int i=0;i<num1;i++) {
					for(int j=0;j<=i;j++) {
						System.out.print("*");
					}
					System.out.println();
				}
				break;
			case 2:
				int num2=6;
				for(int i=num2;i>=0;i--) {
					for(int j=0;j<i;j++) {
						System.out.print("*");
					}
					System.out.println();
				}

				break;
			case 3:
				int num3=6;
				for(int i=0;i<=num3;i++)
				{
					for(int k=0;k<6-i;k++)
					{
						System.out.print(" ");
					}
					for(int j=0;j<=i;j++)
					{
						System.out.print("* ");
					}
					System.out.println();
				}
				break;
			case 4:
				int n=6;
				for(int i=n;i>=0;i--)
				{
					for(int k=0;k<=n-i;k++)
					{
						System.out.print(" ");
					}
					for(int j=0;j<=i;j++)
					{
						System.out.print("* ");
					}
					System.out.println();
				}
				break;
			case 5:
				int n1=6;
				for(int i=0;i<=n1;i++)
				{
					for(int k=0;k<n1-i;k++)
					{
						System.out.print(" ");
					}
					for(int j=0;j<=i;j++)
					{
						System.out.print("* ");
					}
					System.out.println();
				}
				for(int i=n1-1;i>=0;i--)
				{
					for(int k=0;k<n1-i;k++)
					{
						System.out.print(" ");
					}
					for(int j=0;j<=i;j++)
					{
						System.out.print("* ");
					}
					System.out.println();
				}
				break;
			case 6:
				int n2=6;
				for(int i=0;i<n2;i++)
				{
					for(int k=0;k<n2-i;k++)
					{
						System.out.print(" ");
					}
					for(int j=0;j<=n2;j++)
					{
						System.out.print("*");
					}
					System.out.println();
				}
				break;
			case 7:
				int n3=6;
				for(int i=n3-1;i>=0;i--)
				{
					for(int k=0;k<n3-i;k++)
					{
						System.out.print(" ");
					}
					for(int j=0;j<n3;j++)
					{
						System.out.print("*");
					}
					System.out.println();
				}
				break;
			}
			
		}while(ch!=8);
		
	}

}
