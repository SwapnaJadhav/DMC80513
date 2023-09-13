package com.app.geometry;
//1 .Create a class Point2D , in package - "com.app.geometry" : for representing
//a point in x-y co-ordinate system. 
//2. Create a parameterized constructor to init x & y co-ords.
//3. Add a method to return string form of point's x & y co-ords
//4. Hint : public String getDetails())

//5. Add isEqual method to Point2D class :a boolean returning method : must
// return true if n only if both points are having same x,y co-ords or false
// otherwise.
// 6. Add calculateDistance method to calculate distance between current point
// and specified point & return the distance to the caller.

public class Point2D
{
	int x;
	int y;
	public Point2D()
	{
		this.x = x;
		this.y = y;;
	}
	public Point2D(int x, int y) //parameterized const
	{
	    this.x = x;
	    this.y = y;
	}
	
	public String getDetails() {
		return ("p1:"+this.x+" P2:"+this.y);
	
	}

public boolean isequal(Point2D p1, Point2D p2)
{
	if((p1.x == p2.x)&&(p1.y == p2.y))
	{
		return true;
	}
	else 
	{
		return false;
	}
	
}
}// end of Point2D
