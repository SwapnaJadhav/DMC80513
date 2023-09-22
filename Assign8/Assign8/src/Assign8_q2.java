import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

// Q2) Write a Java program to create a new array list, add some colors (string)
// and print out the collection as sorted list.
public class Assign8_q2 
{

	public static void main(String[] args) 
	{
		ArrayList<String> al = new ArrayList<String>();
		al.add("White");
		al.add("Black");
		al.add("Red");
		al.add("Pink");
		al.add("Blue");
		al.add("SkyBlue");
		System.out.println("Colors List:"+al);
		//After Sorting
		Collections.sort(al);
		System.out.println("Sorting List:"+al);
	
		

	}

}
