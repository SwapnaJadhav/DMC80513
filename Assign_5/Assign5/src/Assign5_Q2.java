import java.util.Scanner;

// Q2) Write a java code to check string is palindrome.
public class Assign5_Q2 {

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a string to check whether it is palindrome or not?");
        String str= scanner.nextLine();
          if(isPalindrome(str))
        {
            System.out.println(str +" is a palindrome string");
        }
        else
        {
            System.out.println(str+" is not a palindrome string");
        }
    }
 
    public static boolean isPalindrome(String str) 
    {
        int leftchr = 0, rightchr = str.length() - 1;
        
        while(leftchr < rightchr)
        {
            if(str.charAt(leftchr) != str.charAt(rightchr))
            {
                return false;
            }
            leftchr++;
            rightchr--;
        }
        return true;
	
	}// end of main

}//end of class 
