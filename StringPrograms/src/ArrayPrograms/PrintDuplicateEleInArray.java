package ArrayPrograms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PrintDuplicateEleInArray {

	public static void main(String[] args) {
		int arr1[]= {2,3,4,4,2,5,3,8,8,7,6,6};
		Integer arr[]=new Integer[] {2,3,4,4,2,5,3,8,8,7,6,6};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.print(arr[i]+"  ");
				}
			}
		} /* OR */
//		Set<Integer> set=new HashSet();
//		Arrays.stream(arr1).filter(num ->!set.add(num)).forEach(i->System.out.println(i));


		
			
		
	}
	
	
}
