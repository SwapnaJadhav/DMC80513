import java.util.Scanner;

// Q1) Define a new exception, called ExceptionLineTooLong, 
// that prints out the error message "The strings is too long".
// 2.Write a program that reads a String from user and calculates its length. 
// 3.and throws an exception of type ExceptionLineTooLong 
// in the case where a string of length is more than 80 characters.


//Define a new exception, called ExceptionLineTooLong, 
class ExceptionLineTooLong extends Exception  //UserDefined Exception
{
	ExceptionLineTooLong()
	{
		
	}
}

public class Assign7_q1 
{

	public static void main(String[] args)
	{
		try 
		{
			//Write a program that reads a String from user and calculates its length.
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter String:");
			String Str;
			Str = sc.next();
			System.out.println("String is :"+Str);
			int length = Str.length();
			System.out.println("String Length is:"+length);
			//throws an exception of type ExceptionLineTooLong in the case 
			//where a string of length is more than 80 characters.
			if(length > 80) 
			{
				throw new ExceptionLineTooLong();
			}
			else
			{
				System.out.println(length);
			}
			
		}//end of try_block
		catch(ExceptionLineTooLong e) 
		{
			System.out.println("String length is too long");
		}

	}//end of Main()

}// end of class
