package tester;

import java.util.Scanner;

import com.app.geometry.Point2D;

public class TestPoint {

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter X Cordinate:");
		int x = sc.nextInt();
		System.out.println("Enter Y cordinate:");
		int y = sc.nextInt();
		
		// TODO Auto-generated method stub
		// Point2D p1 = new Point2D(); // 0 0
		
		//String details = p1.getDetails(); 
		Point2D p1 = new Point2D(x,y);
		String details = p1.getDetails();
		System.out.println("p1_details:"+details);
		System.out.println();
		//p2_details
		System.out.println("Enter X Cordinate:");
		int x1 = sc.nextInt();
		System.out.println("Enter Y cordinate:");
		int y1 = sc.nextInt();
		Point2D p2 = new Point2D(x1,y1);
		String details1 = p2.getDetails();
		System.out.println("p2_details:"+details1);
		
		Point2D p3 = new Point2D();
		boolean match = p3.isequal(p1, p2);
		System.out.println("If cordinate equal or not:"+match);
	   
         double distance = p1.calculateDistance(p2);
         System.out.println("Distance: "+distance);
	
	}

}
