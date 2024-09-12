package InterfaceAbstractClassExample;

public class child implements A,B{

	@Override
	public void show() {
		System.out.println("Show method in child class");
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		B.super.display();
	}
	
	static void statMethod()
	{
		System.out.println("static method ofvvvvvvv A");
	}
	

}
