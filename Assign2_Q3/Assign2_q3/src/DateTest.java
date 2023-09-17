import java.util.Scanner;
import java.time.*;

//1. Create a class called Date that includes three instance variables—a
// month (type int), a day (type int) and a year (type int). 
//2. Provide a constructor that initializes the three instance variables and 
// assumes that the values provided are correct. 
// 3.Provide a set and a get method for each instance variable.
// 4.Provide a method displayDate that displays the month, day and
// year separated by forward slashes (/). Write a test application named
// DateTest that demonstrates class Date’s capabilities.
class Date
{
	int dd,mm,yy;

Date()
{
	int dd;
	int mm;
	int yy;
} //end of Parameter_less const
Date(int dd, int mm, int yy)
{
	this.dd = dd;
	this.mm = mm;
	this.yy = yy;
	
} // end of Parameterized Const
// getters and setters
public void setDd(int dd) {
	this.dd = dd;
}
public int getDd() {
	return dd;
}

public void setMm(int mm) {
	this.mm = mm;
}
public int getMm() {
	return mm;
}

public void setYy(int yy) {
	this.yy = yy;
}
public int getYy() {
	return yy;
}


void accept()
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Day: ");
	this.dd = sc.nextInt();
	
	System.out.println("Enter Month:");
	this.mm = sc.nextInt();
	
	System.out.println("Enter Year:");
	this.yy = sc.nextInt();
}// end of accept()

void displayDate() {
	System.out.println("Enter Month/Date/Year:"+this.mm+"/"+this.dd+"/"+this.yy);
}// end_Disp()

}//end of Date_Class
public class DateTest {

	public static void main(String[] args) {
		Date d = new Date();
		d.accept();
		d.displayDate();
		//Date curr_date = d.getDate();
		// int Curr_date = Date.getDate();
         d.LocalDate.now();

	}//end_main()

}// end of DateTest_class
