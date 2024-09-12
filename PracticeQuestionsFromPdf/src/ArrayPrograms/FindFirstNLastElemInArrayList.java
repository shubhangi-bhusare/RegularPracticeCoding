package ArrayPrograms;

import java.util.ArrayList;

public class FindFirstNLastElemInArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(25);
		list.add(32);
//		int first=0;
//		int last=list.size()-1;
//		int[] arr=list.stream().mapToInt(Integer::intValue).toArray();
//		int c=0;
//		int d=0;
//		for(int i=0;i<list.size();i++)
//		{
//			c=arr[0];
//			 d=arr[last];
//		}
//		System.out.println(c+" ----"+d);
		if(!list.isEmpty())
		{
			int first=list.get(0);
			int last=list.get(list.size()-1);
			System.out.println("First element is: "+first);
			System.out.println("Last element is: "+last);
		}else {
			System.out.println("Arraylist is empty!!");
		}

	}

}
