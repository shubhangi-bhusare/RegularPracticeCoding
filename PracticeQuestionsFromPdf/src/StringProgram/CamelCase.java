package StringProgram;

public class CamelCase {

	public static String camelCase(String s)
	{
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ')
			{
				char nextChar=Character.toUpperCase(s.charAt(i+1));
				s=s.substring(0,i)+nextChar+s.substring(i+2);
			}
			
		}
		return s;
	}
	public static void main(String[] args) {
		String str = "I get intern at geeksforgeeks";
		System.out.println(camelCase(str));
		
	}

}
