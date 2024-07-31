package com.test;

import java.util.Arrays;
import java.util.Scanner;

public class orionTest {
	public static void main(String[] args) {
        int[] arr= {2,5,6,7,8,9};
        
        Scanner sc =new Scanner(System.in);
        
        System.out.println("Please enter number");
        int num=sc.nextInt();
        
        
        Arrays.sort(arr);
        
        int close=arr[0];
        for(int i=0;i<arr.length-1;i++) {
        	
        	int diff=0;
        	int diff1=0;
        	if(arr[i]>=num && arr[i+1]<=num) {
        		diff=Math.abs(num-arr[i]);
        		System.out.println(diff);
        		diff1=Math.abs(num-arr[i+1]);
        		System.out.println(diff1);
        		if(diff < diff1) {
            		close=arr[i];
            		break;
            	}else {
            		close=arr[i+1];
            	}
        	}
        	
        }
        
        System.out.println("The Closest of num : "+num+" is : "+close);
	}
}
