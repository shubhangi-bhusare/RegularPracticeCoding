package InterfaceAbstractClassExample;

public class Tester {
	
	public static void main(String[] args)
	{
		child cl=new child();
		cl.show();
		//cl.display();
		A a=new child();
		a.display();
		A.statMethod();
		Object o=new Object();
		
	}
		
}
