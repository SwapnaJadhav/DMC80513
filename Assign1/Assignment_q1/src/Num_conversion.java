
//1. Accept a integer number and when the program is executed print the
//binary, octal and hexadecimal equivalent of the given number.
import java.util.*;
import java.lang.*;
public class Num_conversion {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number:");
		int num = sc.nextInt();
		//Hint : toBinaryString() , toOctalString(), toHexString()
		System.out.println("Given Number:"+num);
		 System.out.println("Binary eqivalent:"+Integer.toBinaryString(num));
		 System.out.println("Octal equivalent:"+Integer.toOctalString(num));
		 System.out.println("Hexadecimal equivalent:"+Integer.toHexString(num));
  
	}

}
