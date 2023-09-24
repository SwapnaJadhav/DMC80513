import java.util.Scanner;

//Create Tester class (Hint : use dynamic method dispatch using interfaces)
// Display Menu
public class Tester 
{

	public static void main(String[] args) 
	{
		/*Employee e = new Employee();
		e.accept();
		e.disp();
		Stack<Employee> st = new Stack<Employee>();
		*/
		Scanner sc = new Scanner(System.in);
		Employee e = new Employee(1, "we", 20000);
		Employee e2 = new Employee(2,"Ash",30000);
		
		Stack st = new FixedStack();
		st.push(e);
		//st.push(e2);
		//st.push(e2);
		st.push(e2);
		st.push(e);
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		
		
		
//		int choice;
//		System.out.println("Enter your choice:");
//		choice =sc.nextInt();
//		
//		System.out.println("1.Fixed Stack \n 2.Growable Stack");
		

	}//end of _main()

}//end of Class_Tester
