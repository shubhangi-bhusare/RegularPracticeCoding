package StringProgram;

import java.util.HashMap;

public class CountNoOfOccurancesInString {

	public static void countWordOccurance(String s)
	{
		
		String arr[]=s.split(" ");
		HashMap<String, Integer> map=new HashMap<String, Integer>();
		for(String str: arr)
		{
			if(map.containsKey(str))
			{
				map.put(str, map.get(str)+1);
			}else {
				map.put(str,1);
			}
		}
		System.out.println("Occurances of word is: "+map);

	}
	public static void main(String[] args) {
		countWordOccurance("Shubhangi mahesh navle");
	}

}
