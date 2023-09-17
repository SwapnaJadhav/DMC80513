import java.util.Scanner;

/*1.
Create a class called Employee that includes three instance variables—a
first name (type String), a last name (type String) and a monthly salary
(double). 
2. Provide a constructor that initializes the three instance variables.
3. Provide a set and a get method for each instance variable. If the monthly
salary is not positive, do not set its value. 
4. Write a test application named
EmployeeTest that demonstrates class Employee’s capabilities. 
5.Create two Employee objects and display each object’s yearly salary. 
6.Then give each Employee a 10% raise and display each Employee’s yearly salary again.
*/
class Employee
{
	String fname;
	String lname;
	double salary;
	Employee() //parameterless const or User-defined default const
	{
		//this.fname = "Swapna";
		//this.lname = "Jadhav";
		//this.salary = 200000;
		// Constructor chaining
		// const call from another cons then it is called const chaining.
	}
	Employee(String fname, String lname, double salary) //parameterized const
	{ 
		this.fname = fname;
		this.lname = lname;
		this.salary = salary;
	}
	void accept()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First_name:");
		this.fname = sc.next();
		System.out.println("Enter Last_name:");
		this.lname = sc.next();
		System.out.println("Enter Monthly_salary:");
		this.salary= sc.nextDouble();
		if(this.salary < 0) {
			this.salary = 0;
			System.out.println(this.salary);
			
		}
	}
	
	void disp()
	{
		System.out.println("First_name:"+this.fname+"  Last_name:"+this.lname+"  Monthly salary:"+this.salary);
	}

	//setter and getters
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}

	public void setSalary(double salary) {
		if(this.salary < 0)
		{
			this.salary = salary;
		}
		
	}
	public double getSalary() {
		return salary;
	}
	void yr_sal()
	{
		// System.out.println(this.fname);
		// System.out.println(this.salary);
		
		double newsal = this.salary*12;
		System.out.println("yearly sal:"+newsal);
	}
	// Employee a 10% raise and display each Employee’s yearly salary again.
	void raise_sal()
	{
		double raisesal = (0.10*salary)+ salary;
		System.out.println("Yearly_raise sal:"+raisesal*12);
	}
}//end of Employee class
public class EmployeeTest {

	public static void main(String[] args) {
		//Employee e = new Employee();
		//e.accept();
		// e.disp();
		// Employee e1 = new Employee("Sidd","Raje", 250000);
		// e1.setFname("Nita");
		// Employee e1 = e;  //reference copy
		// e1.disp();
		// e1.setLname("Mohite");  //set or update data
		 //e1.disp();
		// System.out.println("Fetche the update data");
		// System.out.println(e1.getFname());
		// System.out.println(e1.lname);
		Employee e = new Employee();
		e.accept();
		e.disp();
		e.yr_sal();
		e.raise_sal();
		System.out.println();
		Employee e1 = new Employee();
		e1.accept();
		e1.disp();
		e1.yr_sal();
		e1.raise_sal();
		
	}//end of main()

}//end of main Class
