package tester;
import java.util.Scanner;

import com.app.geometry.Point2D;

//import com.app.geometry;
public class TestPoint1 
{
	

	public static void main(String[] args)
	{
		
     Scanner sc= new Scanner(System.in);
     System.out.println("First co ordinate : ");
     int x= sc.nextInt();
     System.out.println("Second co ordinate: ");
     int y =sc.nextInt();
     
     System.out.println("X Co ordinate: "+x);
     System.out.println("Y Co ordinate: "+y);
     
     Point2D p1 = new Point2D(x,y);
     
     
     System.out.println("First co ordinate : ");
     int x1= sc.nextInt();
     System.out.println("Second co ordinate: ");
     int y1 =sc.nextInt();
     
     System.out.println("X Co ordinate: "+x1);
     System.out.println("Y Co ordinate: "+y1);
     
     Point2D p2 =new Point2D(x1,y1);
     System.out.println(p1.getDetails());
     p1.disp();
     System.out.println(p2.getDetails());
     p2.disp();
     
     boolean match = p1.isEqual(p1,p2);
     System.out.println("Match: " +match);
     
     
     int  dist= p1.calculateDistance(p2);
     System.out.println("Distance: "+dist);
     
     
	}

}