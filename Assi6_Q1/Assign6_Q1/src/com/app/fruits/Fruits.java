package com.app.fruits;

public class Fruits 
{
 private String color;
 private double weight;
 private String name;
 boolean isFresh;
 
 public Fruits()
 {
	this.color="" ;
 }
 

public Fruits(String color, double weight, String name) 
{
	super();
	this.color = color;
	this.weight = weight;
	this.name = name;
	isFresh= true;
}

public void disp()
{
	System.out.println(this);
}


public String taste()
{
	return "no specific taste";
}


public String getColor() 
{
	return color;
}


public void setColor(String color) 
{
	
	this.color = color;
}


public double getWeight() 
{
	return weight;
}


public void setWeight(double weight) 
{
	this.weight = weight;
}


public String getName() {
	return name;
}


public void setName(String name) 
{
	this.name = name;
}


public boolean isFresh()
{
	return isFresh;
}


public void setFresh(boolean isFresh)
{
	this.isFresh = isFresh;
}


@Override
public String toString()
{
	return "Fruits [color=" + color + ", weight=" + weight + ", name=" + name + ", isFresh=" + isFresh + "]";
}//end of toString

}//end of class