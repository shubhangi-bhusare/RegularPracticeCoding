package com.String15thMay;
import java.io.*;
import java.util.*;
public class HackStringPr1 {

	public static void main(String[] args) {
		        Scanner scan = new Scanner(System.in);
		        String s = scan.nextLine();
		        // Write your code here.
//		       if(!scan.hasNext())
//		       {
//		           System.out.println(0);
//		       }
		       
		           String[]a=s.trim().split("[ !,?._'@ ]+");
		           ArrayList<String> list=new ArrayList<>(Arrays.asList(a));
		           System.out.println(list.size());
		           for(String p:list)
		           {
		               System.out.println(p);
		           }
		           
		       }
		        //scan.close();
		    
		



	}


