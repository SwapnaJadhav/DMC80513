package p1;
/*Create a java collection for Product to store Product details
like  id,  name , price;
Add follwoing product in collection
1,"HP Laptop",25000f
2,"Dell Laptop",30000f
3,"Lenevo Laptop",28000f
4,"Sony Laptop",28000f
5,"Apple Laptop",90000f   */

public class Product implements Comparable<Product>
{
	int id;
	String name;
	double price;
	
	public Product() {
		
	}

	public Product(int id, String name, double price) 
	{
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

	@Override
	public int compareTo(Product p) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}// end of class
