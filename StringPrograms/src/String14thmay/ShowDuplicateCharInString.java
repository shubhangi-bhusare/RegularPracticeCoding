package String14thmay;

public class ShowDuplicateCharInString {

//	public static void main(String[] args) {
//		String str = "shubhangi bhusare";
//		char[] newstr = str.toCharArray();
//		int count;
//		for (int i = 0; i < newstr.length; i++) {
//			count = 1;
//			for (int j = i + 1; j < newstr.length; j++) {
//				if (newstr[i] == newstr[j] && newstr[i] != ' ') {
//					count++;
//					newstr[j] = '0';// it not give the visited character
//				} 
//			}
//			if (count > 1 && newstr[i] != '0') {
//				System.out.println(newstr[i]);
//				// System.out.print("occurances of"+newstr[i]+"is: "+count);
//			}
//
//		}
//
//	}
	
	public static void main(String[] args)
	{
		String str="shubhangi bhusare";
		char ch[]=str.toCharArray();
		int count;
		for(int i=0;i<ch.length;i++)
		{
			count=1;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j]&&ch[i]!=' ')
				{
					count++;
					ch[j]='0';//to not count again if any element is repeating
				}
			}
			if(count>1&&ch[i]!='0')
				System.out.println(ch[i]);
		}
	}
	

}
