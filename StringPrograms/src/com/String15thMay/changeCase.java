package com.String15thMay;

public class changeCase {

	public static String convert(String s)
	{
		//s=s.replaceAll(" ", "");
		char ch[]=s.toCharArray();
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<ch.length;i++)
		{
			if(Character.isLowerCase(ch[i]))
			{
				sb=sb.append(Character.toUpperCase(ch[i]));
			}else {
				sb=sb.append(Character.toLowerCase(ch[i]));
			}
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		 String str = "I Get Intern at GeeksForgeeks";
		 System.out.println(convert(str));
	}

}
