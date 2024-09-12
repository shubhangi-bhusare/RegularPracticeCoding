package ArrayPrograms;

import java.util.ArrayList;
import java.util.Collections;

public class SortEvenAndOddElemArray {

	public static void main(String[] args) {
		int arr[]= {3,23,74,45,4,2,88,43,87,42,33,31,8};
		ArrayList<Integer> evens=new ArrayList<Integer>();
		ArrayList<Integer> odds=new ArrayList<Integer>();
		for(int a:arr)
		{
			if(a%2==0)
			{
				evens.add(a);
			}else {
				odds.add(a);
			}
		}
		Collections.sort(evens);
		Collections.sort(odds,Collections.reverseOrder());
		ArrayList<Integer> sortedList=new ArrayList<Integer>();
		sortedList.addAll(evens);
		sortedList.addAll(odds);
		System.out.println(sortedList);
	}

}
