package ArrayPrograms;

public class ArmStrongNumber {

	public static void main(String[] args) {
		int n=153;
		int t=n;
		int arm=0;
		int rem=0;
		while(t>0)
		{
			rem=t%10;
			arm=arm+(rem*rem*rem);
			t=t/10;
		}
		
		if(arm==n)
		{
			System.out.println("ArmStrong Number!!");
		}else {
			System.out.println("Not ArmStrong number!!");
		}

	}

}
