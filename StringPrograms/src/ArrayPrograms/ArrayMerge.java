package ArrayPrograms;

import java.util.Arrays;

public class ArrayMerge {

	public static void main(String[] args) {
		int[] arr1 = new int[] { 4, 8, 6, 9, 2 };
		int arr2[]= {12,32,3,98,11};
		int s=arr1.length+arr2.length;
		int arr3[]=new int[s];
		int counter=0;
		for(int i=0;i<arr1.length;i++)
		{
			arr3[counter]=arr1[i];
			counter++;
		}
		for(int j=0;j<arr2.length;j++)
		{
			arr3[counter]=arr2[j];
			counter++;
		}
		Arrays.sort(arr3);
		//display 
		for(int i=0;i<arr3.length;i++)
		{
			System.out.print(arr3[i]+" ");
		}
	}

}
