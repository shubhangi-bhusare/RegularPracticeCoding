package StringProgram;

public class CountNoOfWordInString {

	public static void main(String[] args) {
		String str="hello, Shubhangi here!";
		String arr[]=str.split(" ");
		System.out.println("Count is: "+arr.length);
		int count=1;
		for(int i=0;i<str.length()-1;i++)
		{
			if((str.charAt(i)==' ') &&(str.charAt(i+1)!=' '))
			{
				count ++;
			}
		}
		System.out.println("count is: "+count);
	}

}
