import java.util.Scanner;

/*1. 
 1.Create a class called Invoice that a hardware store might use to represent
an invoice for an item sold at the store. An Invoice should include four
pieces of information as instance variables—a part number (type String), a
part description (type String), a quantity of the item being purchased (type
int) and a price per item (double). 
2.Your class should have a constructor that initializes the four instance variables. 
3. Provide a set and a get method for each instance variable. 
4. calculates the invoice amount (i.e. multiplies the
quantity by the price per item), then returns the amount as a double value.
5. If the quantity is not positive, it should be set to 0.
If the price per item is not positive, it should be set to 0.0.
Write a test application named InvoiceTest that demonstrate class Invoice’s
capabilities.
*/
class Invoice
{
	String part_no;
	String part_descrip;
	int quantity;
	double price;
	double amount = 0;
	public Invoice() // parameter_less const
	{
		String part_no = "123";
		String part_descrip = "voice";
		int quantity = 2;
		double price = 200000;
		

	}
	public Invoice(String part_no,String part_descrip, int quantity,double price)
	{
		this.part_no = part_no;
		this.part_descrip = part_descrip;
		this.quantity = quantity;
		this.price = price;
		
	}
	//Setters and Getters
	
	public void setPart_no(String part_no) {
		this.part_no = part_no;
	}
	public String getPart_no() {
		return part_no;
	}

	public void setQuantity(int quantity) {
		if(quantity < 0)
		{
			this.quantity = 0;
		}
		else 
		{
		this.quantity = quantity;
		}
	}
	public int getQuantity() {
		return quantity;
	}

	public void setPrice(double price) {
		if(price < 0) 
		{
			this.price = 0.0;
		}
		else 
		{
			this.price = price;
		}
		
	}
	public double getPrice() {
		return price;
	}
	public void accept()
	{  	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your invoice details:");
		System.out.println("Enter Part_number:");
		this.part_no = sc.next();
		
		System.out.println("Enter Description:");
		this.part_descrip = sc.next();
		
		System.out.println("Enter Quantity:");
		this.quantity = sc.nextInt();
		
		System.out.println("Enter Price:");
		this.price = sc.nextDouble();
	}
	void disp()
	{    
		System.out.println("Part_no: "+  this.part_no+"  Description: "+this.part_descrip+"  Quantity:"+this.quantity+"  Price:"+this.price);
		amount = amount + (quantity * price);
		System.out.println("Enter Amount:"+amount);
		
	}
	
} //end of Invoice class
	

public class Assig_q_1 {

	public static void main(String[] args) {
		Invoice iv = new Invoice();
		iv.accept();
		iv.disp();
     	iv.setQuantity(-2);
     	iv.setPrice(-2500);
		// Invoice iv2 = new Invoice("22", "Voice Device", 2, 100000);
		 // iv2.disp();
		 // iv2.setPart_no("234");
		 // iv2.disp();
		 // iv2.setPrice(200000);
		//  iv2.disp();
		// System.out.println("Fetch the price of Invoice part:");
		// System.out.println(iv2.getPrice());
		// .disp();
		// iv2.disp();
		 iv.disp();
//        double amount = 0;
       
	} //end of main method

} // end of Class

