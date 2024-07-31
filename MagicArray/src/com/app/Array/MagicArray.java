package com.app.Array;
import java.util.Scanner;

public class MagicArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no");
		int n=sc.nextInt();
		MagicArray ob=new MagicArray();
		ob.MagicNo(n);
		

	}
	public  void MagicNo(int s) {
		//declare magicsqr array
		int[][] magicsqr=new int[s][s];
		
		//----*TAKE EXAMPLE AS 3 means [3 by 3 matrix]*----
		//m is the no i.e 3 so 
		
		//Initialize row And column for 1
		int r=s/2;   //3/2  =   1  
		int c=s-1;   //3-1  =  2   means assing 1 to [1,2] position
		//one by one put all values in magicsqr array
		for(int no=1;no<=s*s;) {
			if(r==-1&&c==s)//3rd rule-->if computed pos of row is -1 column is m i.e 3
				//then new pos id 0,m-2
			{
				c=s-2;   //for c it is m-1
				r=0;  //for r it is 0
			}else {
				//1st rule help if next no going out of range--->read rule below
				if(c==s) {
					c=0;
				}
				//1st rule help if next no is going out of range 
				if(r<0) {
					r=s-1;
				}
			}
			//2nd rule if computed position is already present then computed c decrease by 2 and computed r increase by 1
			if(magicsqr[r][c]!=0) {
				c=c-2;
				r=r+1;
				continue;
				
			}else {
				//setting the number
				magicsqr[r][c]=no;
				no=no+1;
				
			}
			// the first condition  
			c=c+1;
			r=r-1;
			
		}
		//print all magic no
		System.out.println("The magic Square for: "+s+":\n");
		System.out.println("Sum of each column or row : " +s*(s*s+1)/2+":\n");
		for( r=0;r<s;r++) {
			for(c=0;c<s;c++) {
				System.out.print(magicsqr[r][c]+" ");
			}
			System.out.println();
			
		}
		
	}
	
	
	
	
//	Rule 1: At any position, the position of the next number is computed by decreasing the 
//	row number of the previously filled number by 1 and increasing the column 
//	number of the previously filled number by 1. At any point of time, if the 
//	calculated position of the row becomes -1, then we will wrap it around to m - 1. 
//	Similarly, if the calculated position of the column becomes m, then we will 
//	wrap it around to 0.

//	Rule 2: If at the computed position, a number is already present in the magic
//	square, then the computed position of the column is decreased by 2, and the 
//	computed position of the row is increased by 1.
	
//	Rule 3: If the computed position of the row is -1 & the computed position of the 
//	column is m, then the new position will be: (0, m - 2).

}
