import java.util.Scanner;

// Create Employee class -- id,name,salary, constructor,toString
public class Employee 
{
	int id;
	String name;
	double salary;
	Employee()
	{
		int id = 1;
		String name = "Swapna";
		double salary = 2000;
	}
	Employee(int id,String name, double salary)
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	//getters and setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	//toString Method:
	@Override
	public String toString() {
		return "Employee [id=" + this.id + ", name=" + this.name + ", salary=" + this.salary + "]";
	}
	//accept()
	void accept()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Id:");
		this.id = sc.nextInt();
		System.out.println("Enter the Name:");
		this.name = sc.next();
		System.out.println("Enter the salary:");
		this.salary = sc.nextDouble();
	}
	void disp()
	{
		System.out.println("E_Id:"+this.id+"  E_name:"+this.name+" E_salary:"+salary);
	}
	


}//end of Class
