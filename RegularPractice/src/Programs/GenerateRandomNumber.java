package Programs;

public class GenerateRandomNumber {
    //rules to generate random number is->The generated values uniformly distributed over a definite interval.
	//It is impossible to guess the future value based on current and past values.
	//4 ways to generate random number-> Using the random() Method
//	Using the Random Class
//	Using the ThreadLocalRandom Class
//	Using the ints() Method (in Java 8)
	public static void main(String[] args) {
		//we can use math class random() method to generate random number return type of random method is double
		//this method generate the random no betweeen 0.0 and less than 1.0
		System.out.println("num1: "+Math.random());
         // by using formula math.random*(max-min+1)+min
		int min=100;
		int max=200;
		System.out.println("Random value between num1 and num2 is: ");
		double a=Math.random()*(max-min+1)+min;
		System.out.println(a);
		System.out.println("Random value between num1 and num2 in int form is: ");
		int b=(int)(Math.random()*(max-min+1)+min);
		System.out.println(b);

	}

}
