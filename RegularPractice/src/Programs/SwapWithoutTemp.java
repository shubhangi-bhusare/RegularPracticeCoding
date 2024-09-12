package Programs;

public class SwapWithoutTemp {

	public static void main(String[] args) {
		int a=12;
		int b=23;
		 a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping a is: "+a);
		System.out.println("After swapping b is: "+b);

	}

}
