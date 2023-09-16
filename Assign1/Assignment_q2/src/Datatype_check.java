import java.util.Scanner;

/*2. Accept 2 double values from User (using Scanner). Check data type. If
arguments are not doubles, supply suitable error message & terminate.
if numbers are double values, print its average.*/

public class Datatype_check 
{

	public static void main(String[] args) 
	{
		//double dval1;
		//double dval2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two double values:");
		if(sc.hasNextDouble())
		{ 
	    double dval1 = sc.nextDouble();
	    System.out.println(dval1);
		double dval2 = sc.nextDouble();
		System.out.println(dval2);
		  // if(sc.hasNextDouble())
		   
			double avg =((dval1+dval2)/2);
			System.out.println("Average is:"+avg);
		 }
		else
		{
			System.out.println("Not Valid");
	    } 
		   
	}	// end_main()

}//end of class
