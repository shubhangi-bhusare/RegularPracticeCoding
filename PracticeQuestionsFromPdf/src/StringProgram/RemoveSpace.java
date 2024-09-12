package StringProgram;

public class RemoveSpace {
	public static String removeSpace(String s)
	{
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			{
				sb.append(s.charAt(i));
			}
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		String str="Shubhangi mahesh navle";
		System.out.println(removeSpace(str));
	}

}
