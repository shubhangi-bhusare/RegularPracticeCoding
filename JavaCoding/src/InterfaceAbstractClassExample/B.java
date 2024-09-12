package InterfaceAbstractClassExample;

public interface B {
	void show();
	public default void display()
	{
		System.out.println("default method of Interface B");
	}
	public static void statMethod()
	{
		System.out.println("static method of interface B");
	}
}
