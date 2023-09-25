// Q3) Declare two Arrays of type String.
// Find the duplicate values of an array
// of string values. (Hint: use equals())
import java.util.Scanner;

public class Duplicate_Array
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 5 strings");
		String[] arr1 = new String[5];
		for (int i = 0; i < 5; i++) 
		{
			arr1[i] = sc.nextLine();

		}
		System.out.println("Enter the 5 strings");
		String[] arr2 = new String[5];
		for (int i = 0; i < 5; i++)
		{
			arr2[i] = sc.nextLine();
		}
		for (String s1 : arr1) 
		{
			for (String s2 : arr2)
			{
				if (s1.equals(s2)) 
				{
					System.out.println("Found dublicate String values:" + s1 + " " + s2);
				}
			}
		}// end of main
}// end of Class

}
