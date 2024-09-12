package com.app.test;

public class minMax {
	    public static int maxProfit(int[] prices) {
	        int min=0;
	        for(int i=0;i<prices.length;i++)
	        {
	             if(prices[i]<prices[min])
	            {
	                min=i;
	            }
	        }
	        int max=min;
	        for(int i=min;i<prices.length;i++)
	        {
              if(prices[i]>prices[max])
	            {
	                max=i;
	            } 
	        }
	        if(min==prices.length-1)
	        return 0;
	        return prices[max]-prices[min];
   
	}
	public static void main(String[] args) {
		int [] prices = {7,1,5,3,6,4};
		System.out.println(maxProfit(prices));

	}

}
