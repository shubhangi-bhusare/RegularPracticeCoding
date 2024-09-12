package StringProgram;

public class CheckTwoStringAnagramOrNot {
	public static boolean checkAnagram(String str1,String str2)
	{
		if(str1.length()!=str2.length())
		{
			return false;
		}
		int arr[]=new int[256];
		for(int i=0;i<str1.length();i++)
		{
			arr[str1.charAt(i)]++;
			arr[str2.charAt(i)]--;
		}
		for(int count:arr)
		{
			if(count!=0)
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		System.out.println(checkAnagram("silent","listen"));

	}

}
