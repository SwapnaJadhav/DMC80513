package p3;

import java.util.Scanner;

import p1.Mobile;
import p2.Laptop;

public class Program {

	public static void main(String[] args) {
		// mobj = new mobile();
	    // Mobile mobj = new Mobile("Redme11",200000, "Black", "Android");
	    // System.out.println(mobj); //toString() call ho rahi hai ==>hashcode
	    // mobj.disp();
	    
	    //Laptop
	   // Laptop L1 = new Laptop("Lenovo", 80000, "Black","64GB", "Ubuntu");
	   // L1.disp();
			
			
	      //if 1. display Mobile details or 2. display Laptop Details
	      System.out.println("Enter your choice:");
	      Scanner sc = new Scanner(System.in);
	      int num = sc.nextInt();
	      do
	      {
	      switch (num)  
	      {     
	          case 0: System.out.println("Exit");
	                  break;
	          case 1: Mobile mobj = new Mobile();    
	                  mobj.disp(); 
	                  break;  
	          case 2: Laptop L1 = new Laptop();              
	                  L1.disp();
	                  break;  
	             
	          default:  
	              System.out.println(0);  
	              break;  
	      }             
	      }while(num!=0);
	
		
		
	}//end of main()

}//end of class
