import java.util.HashSet;
import java.util.Scanner;

// Q1) Store book details in a library in hashing based data structure : HashSet
// Book details :
// isbn(string),category(enum),price(double),publishDate,authorName(string),quantity(int)
// Unique ID : isbn
// Accept at least 5 book details from user & display.
enum Category
{
	HISTORY, BIOGRAPHY, FANTASY, SELFHELP_BOOK
}//end of enum
class Book_Details
{
	
	
	String isbn;
	double price;
	int publishDate;
	String autherName;
	int quantity;
	Category ct;
	public Book_Details() 
	{
		// TODO Auto-generated constructor stub
	}
	
	public Book_Details(String isbn, double price, int publishDate, String autherName, int quantity) 
	{
		this.isbn = isbn;
		this.price = price;
		this.publishDate = publishDate;
		this.autherName = autherName;
		this.quantity = quantity;
		
	}

	void accept()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter books details: ");
		System.out.println("Enter the isbn: ");
		this.isbn = sc.next();
		System.out.println("Enter the price:");
		this.price = sc.nextDouble();
		System.out.println("Enter the publish date:");
		this.publishDate = sc.nextInt();
		System.out.println("Enter the auther name:");
		this.autherName = sc.next();
		System.out.println("Enter the quantity:");
		this.quantity = sc.nextInt();
		System.out.println("Enter the Category:");
		ct = Category.values()[sc.nextInt()];
}

	@Override
	public String toString() {
		return "Book_Details [isbn=" + isbn + ", price=" + price + ", publishDate=" + publishDate + ", autherName="
				+ autherName + ", quantity=" + quantity + ", ct=" + ct + "]";
	}

	
	
	
}// end of_class

public class Assign9_Q1 {

	public static void main(String[] args) {
		HashSet<Book_Details> hs = new HashSet<Book_Details>();
		Book_Details b1 = new Book_Details();
		b1.accept();
		Book_Details b2 = new Book_Details();
		b2.accept();
//		Book_Details b3 = new Book_Details();
//		b3.accept();
//		Book_Details b4 = new Book_Details();
//		b4.accept();
//		Book_Details b5 = new Book_Details();
//		b5.accept();
		hs.add(b1);
		hs.add(b2);
//		hs.add(b3);
//		hs.add(b4);
//		hs.add(b5);
		System.out.println(hs);
		
	}

}
