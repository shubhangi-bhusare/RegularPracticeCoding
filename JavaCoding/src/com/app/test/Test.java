package com.app.test;

import java.util.Stack;

public class Test {
	public static int evalRPN(String[] s)
	{
		int retvalue=0;
		String operators="+-*/";
		Stack<String> stack=new Stack<String>();
		for(String t:s)
		{
			if(!operators.contains(t))
			{
				stack.push(t);
			}else {
				int a=Integer.valueOf(stack.pop());
				int b=Integer.valueOf(stack.pop());
				int index=operators.indexOf(t);
				switch(index)
				{
				case 0:
					stack.push(String.valueOf(a+b));
					break;
				case 1:
					stack.push(String.valueOf(b-a));
					break;
				case 2:
					stack.push(String.valueOf(a*b));
					break;
				case 3:
					stack.push(String.valueOf(b/a));
					break;
				}
			}
		}
		
		retvalue=Integer.valueOf(stack.pop());
		return retvalue;
	}

	public static void main(String[] args) {
		String [] str=new String[] {"2","1","+","3","*"};
		System.out.println(evalRPN(str));
	}
	
	

}
