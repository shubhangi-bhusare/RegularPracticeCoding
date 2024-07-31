package String14thmay;

public class ReverseStringWordToWord {

	public static void main(String[] args) {
		String str="shubhangi bhusare";
		String[] newstr=str.split(str);
		StringBuilder sb=new StringBuilder(str);
		for(int i=0;i<str.length();i++)
		{

//			System.out.println(new StringBuilder(str).reverse());
			sb=sb.reverse();//reverse method is not present in string class so we need to conver
			//String to StringBuilder becoz in StringBuilder reverse method is present
			
		}
		System.out.println(sb);
		

	}

}
