package RegularPractice;

public class CountNoofUppercaseLowecaseDigitAndWhiteSpacesInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Shubhs78!2hjr hhwu yasAy iA";
		char str1[]=str.toCharArray();
		int cnt1=0,cnt2=0,cnt3=0,cnt4=0 ;
		for(int i=0;i<str1.length;i++)
		{
			//char i1=str.charAt(i);
			if(Character.isUpperCase(str.charAt(i)))
			{
				cnt1++;
			}else if(Character.isLowerCase(str.charAt(i)))
			{
				cnt2++;
			}else if(Character.isDigit(str.charAt(i)))
			{
				cnt3++;
			}else if(Character.isWhitespace(str.charAt(i))) {
				cnt4++;
			}
			
			
		}
		System.out.println("No of Uppercase character is:"+cnt1);
		System.out.println("No of lowercase character is:"+cnt2);
		System.out.println("No of digit  is:"+cnt3);
		System.out.println("No of whitespaces are :"+cnt4);
		
	}

}
