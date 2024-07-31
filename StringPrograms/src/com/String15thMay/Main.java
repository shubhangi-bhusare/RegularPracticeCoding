package com.String15thMay;

import java.util.Arrays;

//public class a {
//
//	public static void main(String[] args) {
//		String[] a = {"geeksforgeeks", "geeks", "geek", "geezer"};
//		Arrays.sort(a);
//		
//	}
public class Main {
    // Function to remove spaces and convert into camel case
    public static String convert(String str) {
        int i = 0;
        while (true) {
            i = 0;
            while (i < str.length()) {
                if (str.charAt(i) == ' ') {
                    char nextChar = Character.toUpperCase(str.charAt(i+1));
                    str = str.substring(0, i) + nextChar + str.substring(i+2);
                    // Terminate inner loop after removing a space and making character next to it as capital
                    break;
                }
                i++;
            }
            // Terminate outer loop when we reach to the end of string
            if (i == str.length()) {
                break;
            }
        }
 
        return str;
    }
 
    // Driver program
    public static void main(String[] args) {
        String str = "I get intern at geeksforgeeks";
        System.out.println(convert(str));
    }


}
