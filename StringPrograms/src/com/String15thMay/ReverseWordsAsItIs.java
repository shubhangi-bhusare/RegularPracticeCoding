package com.String15thMay;

public class ReverseWordsAsItIs {

	public static void main(String[] args) {
		String str="I like programming very much";
		//String arr[]="I like programming very much".split(" ");
		String arr[]=str.split(" ");
		String res="";
		for(int i=arr.length-1;i>=0;i--)
		{
			res+=arr[i]+" ";
		}
		System.out.println(res);
		

	}
	

}
















