import java.util.Scanner;

// 2) (Credit Limit Calculator)
// 1.Develop a Java application that determines whether any of several
// department-store customers has exceeded the credit limit on a
// charge account.

//2.For each customer,the following facts are available:
// a) account number
// b) balance at the beginning of the month
// c) total of all items charged by the customer this month
// d) total of all credits applied to the customer’s account this month
// e) allowed credit limit.

//3.The program should input all these facts as integers, 
// calculate the new balance (= beginning balance+ charges – credits),
// display the new balance and determine whether the new balance
// exceeds the customer’s credit limit. 
//4.For those customers whose credit limit is exceeded, the program should display
//the message "Credit limit exceeded".
class Customer
{
	int acc_no;
	int beg_month_balance;
	int items_charged_mon;
	int all_credits;
	int credit_limit;
	
void accept()
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Account_number:");
	acc_no = sc.nextInt();
	
	System.out.println("Enter balance at the beginning of the month:");
	beg_month_balance = sc.nextInt();
	
	System.out.println("Enter all items charged by the customer this month:");
	items_charged_mon = sc.nextInt();
	
	System.out.println("Enter total of all credits");
	all_credits = sc.nextInt();
	
	System.out.println("Enter allowed credit limit:");
	credit_limit = sc.nextInt();
} //end of accept method

void disp()
{
	System.out.println("Acc_number:"+acc_no+"  beg_Balance:"+beg_month_balance+"  Items_Charged:"+items_charged_mon+"  All_credits:"+all_credits+"  Limit_credit:"+credit_limit);
}  //end of disp method

//1. calculate the new balance (= beginning balance+ charges – credits),
//Determine whether the new balance exceeds the customer’s credit limit,
// For those customers whose credit limit is exceeded, 
//the program should display
//the message "Credit limit exceeded"
void new_balance()
{
	int newbal = beg_month_balance + items_charged_mon-all_credits;
	System.out.println("New balance :"+ newbal);
	if(newbal > credit_limit)
	System.out.println("Credit limit is exceeded");
}

}// end of customer
public class Cust_Depart {
	
	public static void main(String[] args) {
		Customer c = new Customer();
		c.accept();
		c.disp();
		c.new_balance();

	}// end of main()

}// end of Cust_Depart
