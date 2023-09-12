package p1;

import java.util.Scanner;

public class Mobile 
{
	String name;
	int price;
	String os_type;
	String colour;
	public Mobile() // Parameterless Constructor
	{
		String name = "Redme 11";
		int price = 20000; 
		String os_type = "Andriod";
		String colour = "Black";
	}
	public Mobile(String name,int price,String os_type, String colour) //parametrized Constructor
	{
		this.name = name;
		this.price = price;
	    this.os_type = os_type;
	    this.colour = colour;
	}
	public void accept() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Mobile Name:");
		String name = sc.next();
		System.out.println("Enter Mobile Price:");
		int price = sc.nextInt();
		System.out.println("Enter Mobile Os type:");
		String os_type = sc.next();
		System.out.println("Enter Mobile Colour:");
		String colour = sc.next();
		
	}
	public void disp()
	{
		System.out.println("Name:= "+this.name+" Price:= "+this.price+" Os_type:"+this.os_type+" Colour:="+this.colour);
	}
	//setters
	void setName(String name)
	{
		this.name = name;
	}
	void setPrice(int price)
	{
		this.price = price;
	}
	void setColour(String colour)
	{
		this.colour = colour;
	}
	
	//getters
    String getName()
    {
    	return this.name;
    }
    int getPrice()
    {
    	return this.price;
    }
    String getColour()
    {
    	return this.colour;
    }

 //faciliator
	
}
