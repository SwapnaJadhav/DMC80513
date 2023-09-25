package p1;
import java.util.Scanner;


public class Point2D 
{
	int x;
	int y;

	public Point2D() 
	{
//		x = 3;
//		y = 5;
	}
	public void accept() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x:");
		x= sc.nextInt();
		System.out.println("Enter y:");
		y=sc.nextInt();
		
	}

	public Point2D(int x, int y) 
	{
		this.x = x;
		this.y = y;
	}

	public String getDetails() 
	{
		return this.x +"," +this.y;
	}

	public void disp() 
	{
		System.out.println("x: "+x + "y: "+y);
		
	}
	
	public boolean isEqual(Point2D p1, Point2D p2) 
	{
		if(p1.x==p2.x && p1.y==p2.y) {
			
			return true;
		}else 
		{
			return false;
		}
	}
	public int getX() 
	{
		return x;
	}
	public void setX(int x)
	{
		this.x = x;
	}
	public int getY()
	{
		return y;
	}
	public void setY(int y) 
	{
		this.y = y;
	}
	@Override
	public String toString() 
	{
		return "Point2D [x=" + x + ", y=" + y + "]";

	}
		
   public int calculateDistance(Point2D p) 
   {
 
	 int dist =(int) Math.sqrt((this.y-p.y)*(this.y - p.y) + (this.x - p.x) * (this.x - p.x));
	 return dist;
   }

}// end of Class