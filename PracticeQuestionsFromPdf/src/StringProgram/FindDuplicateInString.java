package StringProgram;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class FindDuplicateInString {

	public static void duplicateCharacterCount(String s)
	{
		HashMap<Character, Integer> map=new HashMap<Character, Integer>();
		char [] arr=s.replaceAll(" ", "").toCharArray();
		for(char c: arr)
		{
			if(map.containsKey(c))
			{
				map.put(c,map.get(c)+1);
			}else {
				map.put(c,1);
			}
		}
		System.out.println("Count of Characters in map: "+map);
		map.entrySet().stream().filter(i->i.getValue()>1).forEach(i->System.out.println(i.getKey()));
		System.out.println("Count of only duplicate elements is: ");
		
		Set<Character> set=map.keySet();
		for(Character ch: set)
		{
			if(map.get(ch)>1)
			{
				System.out.println(ch+":"+map.get(ch));
			}
		}
	}
	public static void main(String[] args) {
		duplicateCharacterCount("Learn Java Programming");

	}

}
