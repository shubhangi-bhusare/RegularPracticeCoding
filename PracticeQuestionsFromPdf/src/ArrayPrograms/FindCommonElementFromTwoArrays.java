package ArrayPrograms;

import java.util.HashSet;
import java.util.Set;

public class FindCommonElementFromTwoArrays {

	public static Set<Integer> findCommon(int arr1[],int arr2[])
	{
		Set<Integer> set1=new HashSet<Integer>();
		Set<Integer> commonElem=new HashSet<Integer>();
		for(int a:arr1)
		{
			set1.add(a);
		}
		for(int a:arr2)
		{
			if(set1.contains(a))
			{
				commonElem.add(a);
			}
		}
		return commonElem;
	}
	
	public static void main(String[] args) {
		int[] array1 = {1, 2, 3, 4, 5};
		int[] array2 = {4, 5, 6, 7, 8};
		System.out.println(findCommon(array1,array2));

	}

}
