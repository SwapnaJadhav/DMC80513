// Q3) Sort the book details as per publish date and display it.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
//Sort the book details as per publish date and display it.
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;
enum Category{Horror,Fiction, Novel, Historical,Memoir}
class BookDetails implements Comparable<BookDetails>
{
	private int ISBN;
	private double price;
	private String publishDate;
	private String authorName;
	private int quantity;
	
	{
	int sum = 0, count = 0, m = 10;
    while (ISBN != 0) {
        int d = (int)(ISBN % 10);
        count++;
        sum += d * m;
        m--;
        ISBN /= 10;
    }
    
	}
  
	public BookDetails() 
	{
		super();
		
	}

	public BookDetails(int iSBN, double price, String publishDate, String authorName, int quantity) {
		super();
		ISBN = iSBN;
		this.price = price;
		this.publishDate = publishDate;
		this.authorName = authorName;
		this.quantity = quantity;
		
	}

	public int getISBN() {
		return ISBN;
	}

	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	
	 @Override
	    public int compareTo(BookDetails other) {
	        return this.publishDate.compareTo(other.publishDate);
	    }
	@Override
	public String toString() {
		return "BookDetails [ISBN=" + ISBN + ", price=" + price + ", publishDate=" + publishDate + ", authorName="
				+ authorName + ", quantity=" + quantity + "]";
	}

	
	
	
	
}



public class Assign9_Q3 
{

	public static void main(String[] args) 
	{
		ArrayList<BookDetails> books = new ArrayList<>();
		
	    books.add(new BookDetails(12, 1234, "2000-05-15" ,"Author A",2));
	    books.add(new BookDetails(13, 1234, "2010-03-5","Author B",2));
	    books.add(new BookDetails(14, 1234, "2020-04-15","Author C", 2));
	    books.add(new BookDetails(15, 1234, "2012-05-13", "Author D", 2));
	    books.add(new BookDetails(16, 1234,"2001-09-15", "Author E",  2));

        // Sort the list of books by publish date
        Collections.sort(books);

        // Display the sorted list of books
        for (BookDetails book : books) {
            System.out.println(book);
        }
		
		
	}
	

}