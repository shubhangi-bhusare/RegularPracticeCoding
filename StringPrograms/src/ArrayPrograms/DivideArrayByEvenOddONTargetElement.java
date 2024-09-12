package ArrayPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DivideArrayByEvenOddONTargetElement {

	public static void DivideArr(int arr[], int t)
	{
		int even[]=Arrays.stream(arr).filter(i->i!=t && i%2==0).toArray();
		int odd[]=Arrays.stream(arr).filter(i->i!=t && i%2!=0).toArray();
		List<Integer>l=new ArrayList<Integer>();
		for(int i:even)
		{
			l.add(i);
		}
		l.add(t);
		for(int i:odd)
		{
			l.add(i);
		}
		System.out.println(l);
	}
	public static void main(String[] args) {
		
	 int[] arr1 = new int[] { 4, 8, 6, 9, 2,3,7 };
	 DivideArr(arr1,7);
	}
	

}
