package ArrayPrograms;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeTwoArraySort {

	public static int[] MergeSortedArray(int arr1[],int arr2[])
	{
//		return IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2))
//				.sorted()
//				.toArray();
		//OR
		int res[]=new int[arr1.length+arr2.length];
		int counter=0;
		for(int i=0;i<arr1.length;i++)
		{
			res[counter]=arr1[i];
			counter++;
		}
		for(int i=0;i<arr2.length;i++)
		{
			res[counter]=arr2[i];
			counter++;
		}
		Arrays.sort(res);
		return res;
	}
	public static void main(String[] args) {
		int arr1[]= {1,3,5,7};
		int arr2[]= {2,4,6,8};
		int res[]=MergeSortedArray(arr1,arr2);
		for(int i:res)
		{
			System.out.print(i+" ");
		}
	}

}
