package StringProgram;

import java.util.Arrays;

public class superReducedString {

	public static String superReducedString(String s)
	{
		StringBuilder sb=new StringBuilder();
		char arr[]=s.toCharArray();
		Arrays.sort(arr);
		for(char c:arr)//"aaabccddd" a
		{
			int len=sb.length();
			if(len>0 && sb.charAt(len-1)==c)
			{
				sb.deleteCharAt(len-1);
			}else {
				sb.append(c);
			}
			
		}
		return sb.length()==0?"Empty string":sb.toString();
	}
	public static void main(String[] args) {
		String input1 = "aaabccddd";
        String result1 = superReducedString(input1);
        System.out.println(result1);
        String input2 = "aa";
        String result2 = superReducedString(input2);
        System.out.println(result2); // Output: "Empty String"

        String input3 = "baacccb";
        String result3 = superReducedString(input3);
        System.out.println(result3); // Output: "Empty String"
	}

}
