package StringProgram;

import java.util.Arrays;

public class SortStringOnBasisOfSecondLetter {

	public static void main(String[] args) {
//		Write a code which will sort the array based on the second name
//		Input: ["Rahul gandhi", "narendra Modi","Mamata banerjee"]
//		Output: ["Mamata banerjee", "Rahul gandhi", "narendra Modi"]
//		String arr[]= {"Rahul gandhi", "narendra Modi","Mamata banerjee"};
//		for(int i=0;i<arr.length;i++)
//		{
//			for(int j=i+1;j<arr.length;j++)
//			{		
//				String secWord=arr[i].substring(arr[i].indexOf(' ')+1);
//				String secword2=arr[j].substring(arr[j].indexOf(' ')+1);
//				
//				if(secWord.compareToIgnoreCase(secword2)>0)
//				{
//					String temp=arr[i];
//					arr[i]=arr[j];
//					arr[j]=temp;	
//				}
//							
//			}
//		}
//		for(int i=0;i<arr.length;i++)
//		{
//			System.out.print(arr[i]+" ");
//		}
		String arr[]= {"Rahul gandhi", "narendra Modi","Mamata banerjee"};

		Arrays.sort(arr, (a,b)->{
			String word1=a.substring(a.indexOf(' ')+1);
			String word2=b.substring(b.indexOf(' ')+1);			
			return word1.compareToIgnoreCase(word2);
		});
		
		for(String s: arr)
		{
			System.out.print(s+" ");
		}
		
	}

}
