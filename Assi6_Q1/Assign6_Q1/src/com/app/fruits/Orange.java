package com.app.fruits;
public class Orange extends Fruits 
{

	public Orange(String color, double weight, String name) 
	{
		super(color, weight, name);
		
	}

	public String toString() 
	{
		return "Orange [Color=" + getColor() + ", Weight=" + getWeight() + ", Name=" + getName()+ "]";
	}
	public void disp() 
	{
		System.out.println(this.toString());
	}
    public String taste()
    {
		return " sour";
	}
	
}