package StringProgram;

public class getCharacterCount {

	
	//Java program to gives Output: a2b2c3d2
	//for the Input String Str = “aabbcccdd”
	public static String getCount(String str)
	{
		StringBuilder sb=new StringBuilder();
		int count=1;
		for(int i=0;i<str.length();i++)
		{
			if(i+1<str.length() && str.charAt(i)==str.charAt(i+1))
			{
				count++;
			}else {
				sb.append(str.charAt(i)).append(count);
				count=1;//if we not reset it it will consider count before elements
			}
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		String s="aabbcccdddd";
		System.out.println(getCount(s));
	}

}
