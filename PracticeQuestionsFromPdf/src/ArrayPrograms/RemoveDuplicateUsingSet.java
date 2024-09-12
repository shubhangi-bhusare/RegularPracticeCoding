package ArrayPrograms;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateUsingSet {

	public static int[] RemoveDuplicate(int []a)
	{
		Set<Integer> set=new HashSet<Integer>();
		
		for(int i:a)
		{
			set.add(i);
		}
		int res[]=new int[set.size()];
		int i=0;
		for(int b:set)
		{
			res[i++]=b;
		}
		return res;
	}
	public static void main(String[] args) {
		int arr[]= {3,2,4,3,7,6,2,9};
//		System.out.println(RemoveDuplicate(arr));
		int u[]=RemoveDuplicate(arr);
		for(int i:u)
		{
			System.out.print(i+" ");
		}

	}

}
