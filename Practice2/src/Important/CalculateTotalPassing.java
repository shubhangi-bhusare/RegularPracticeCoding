package Important;

public class CalculateTotalPassing {
	public static int calculatePassing(String s)
	{
		int right_movers=0;
		int total_Passing=0;
		for(char person:s.toCharArray())
		{
			if(person=='>')
			{
				right_movers++;
			}
			else if(person=='<')
			{
				total_Passing+=right_movers;
			}
		}
		return total_Passing;
	}
	public static void main(String[] args) {
		String corridor = ">><<>>><";
		int res=calculatePassing(corridor);
		System.out.println(res);

	}

}
