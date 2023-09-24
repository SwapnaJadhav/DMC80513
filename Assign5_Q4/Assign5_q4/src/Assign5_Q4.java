// Q4) Write an enum type TrafficLight, whose constants (RED,
// GREEN, YELLOW) take one parameter—the duration of the light.
// Write a program to test the TrafficLight enum so that it
// displays the enum constants and their durations.
enum TrafficLight
{
	RED(100), GREEN(50), YELLOW(20);
	private final int duration;
	TrafficLight(int durationsec) 
	{
		this.duration = durationsec;
	
	}
	public int getduration()
	{
		return duration;
	}

	
}// end of enum
public class Assign5_Q4 
{

	public static void main(String[] args) 
	{
		TrafficLight tl;
		tl = TrafficLight.RED;
		System.out.println(tl.getduration());
		System.out.println("Trafficelight is:"+tl+"\nName_Color: "+ tl.name());
		tl = TrafficLight.GREEN;
		System.out.println("Trafficelight is:"+tl+"\nName_Color: "+ tl.name()+"  Duration in sec is:"+tl.getduration());
		tl = TrafficLight.YELLOW;
		System.out.println("Trafficelight is:"+tl+"\nName_Color: "+ tl.name()+" Duration in sec is: "+tl.getduration());
	}
	

}
