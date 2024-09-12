package InterfaceAbstractClassExample;

public interface A {
		void show();
		default void display()
		{
			System.out.println("default method of Interface A");
		}
		static void statMethod()
		{
			System.out.println("static method of interface A");
		}
}
