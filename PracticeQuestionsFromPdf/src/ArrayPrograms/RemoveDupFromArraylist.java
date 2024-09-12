package ArrayPrograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class RemoveDupFromArraylist {
	public static ArrayList<Integer> RemoveDup(ArrayList<Integer> a)
	{
		Set<Integer> set=new HashSet<Integer>(a);
		return new ArrayList<Integer>(set);
	}
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(5);
		al.add(9);
		al.add(1);
		al.add(6);
		al.add(9);
		al.add(1);
		al.add(4);
		al.add(9);
		al.add(1);
		ArrayList<Integer> list= RemoveDup(al);
		for(int i:list)
		{
			System.out.print(i+" ");
		}

	}

}
