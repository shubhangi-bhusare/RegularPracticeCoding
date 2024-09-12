package StringProgram;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public static boolean isIsomorphic(String s, String t) {
        Map<Character,Character> map1=new HashMap<>();
        Map<Character,Character> map2=new HashMap<>();
        if(s.length()!=t.length())
        {
            return false;
        }
        
        int idxS[]=new int[200];
        int idxT[]=new int[200];
        for(int i=0;i<s.length();i++)
        {
            if(idxS[s.charAt(i)]!=idxT[t.charAt(i)])
            {
                return false;
            }
            idxS[s.charAt(i)]=i+1;
            idxT[t.charAt(i)]=i+1;
        }
        return true;
    }
    public static void main(String[] args) {
		String s = "egg", t = "add";
		System.out.println(isIsomorphic(s,t));
	}

}
