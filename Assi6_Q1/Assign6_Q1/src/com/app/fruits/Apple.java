package com.app.fruits;

public class Apple extends Fruits 
{
	public Apple(String color, double weight, String name)
	{
		super(color, weight, name);
		
	}
	public String toString() 
	{
		return "Apple [Color()=" + getColor() + ", Weight()=" + getWeight() + ", Name()=" + getName() + "]";
	}
	public String taste() 
	{
		return "sweet n sour";
	}
}// end of class