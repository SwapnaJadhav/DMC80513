package tester;

import p1.*;
import p1.Point2D;

import java.util.Scanner;

public class TestPoint
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter length of points");
	    int size = sc.nextInt();
        Point2D points[] = new Point2D[size];
		
		System.out.println("enter " + size + " number of points");
		for (int i = 0; i < size; i++) 
		{
			int x = sc.nextInt();
			int y = sc.nextInt();
			points[i] = new Point2D(x, y);
		}
        System.out.println("Displying array elemetns : ");//Display

		for (Point2D i : points)
			System.out.println(i); 

		int choice;

		do {
			System.out.println("1.Specific Point \n 2.display x,y co ordinates all points \n 3.validate the 2 indices \n 4.Exit");
	
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Choice Display details of a specific point");
				System.out.println("Give me index");
				int index = sc.nextInt();
				Point2D p= points[index];
				
				System.out.println( "Enter :"+p.getDetails());
                break;
                
                
			case 2:
				System.out.println("Display x, y co-ordinates of all points");
				
				for(Point2D p1:points)
                 //System.out.println(p1.getDetails());
				p1.disp();
				break;
				
			case 3:
				System.out.println("User i/p : 2 indices for the points , validate the indices");
				int x= sc.nextInt();
				int y= sc.nextInt();
				for(int i=0;i< points.length;i++) {
					Point2D p1= points[i];
					
					if(p1.getX()==x && p1.getY()==y ) {
						System.out.println("Fount the point at index "+i);
			          }
					
				}
					
				break;
			case 4:
				System.out.println("Exit");
				break;

			}

		} while (choice >= 0);

	}

}
