package com.app.fruits;
public class Mango extends Fruits 
{
	public Mango(String color, double weight, String name) 
	{
		super(color, weight, name);
		
	}
    public String toString() 
    {
		return "Mango [Color=" + getColor() + ", Weight=" + getWeight() + ", Name=" + getName()
				+ ", isFresh=" + isFresh() + "]";
	}


	public void disp() {
		System.out.println(this.toString());
	}

	
	public String taste() {
		return "sweet";
	}
}// end of Class