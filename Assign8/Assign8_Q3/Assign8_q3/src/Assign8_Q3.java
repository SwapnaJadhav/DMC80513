import java.util.ArrayList;

// Q3) Write a Java program to replace the second element of a ArrayList with
// the specified element.
public class Assign8_Q3
{

	public static void main(String[] args) 
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(44);
		al.add(60);
		al.add(90);
		System.out.println("List Elements are:"+al);
		al.add(2, 80);
		System.out.println("Replace Element :"+al);
		System.out.println();
		al.add(2, 60);
		System.out.println("Replace the second Element:"+al);
	
	}

}
