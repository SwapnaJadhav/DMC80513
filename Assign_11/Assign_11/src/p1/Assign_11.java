package p1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*Add follwoing product in collection
1,"HP Laptop",25000f
2,"Dell Laptop",30000f
3,"Lenevo Laptop",28000f
4,"Sony Laptop",28000f
5,"Apple Laptop",90000f*/

public class Assign_11 
{

	public static void main(String[] args) 
	{
		ArrayList<Product> al = new ArrayList<Product>();
		Product p = new Product();
		
	/*	Scanner sc = new Scanner(System.in);
		 int id = sc.nextInt();
		 String name = sc.next();
		 double price = sc.nextDouble();
		 p = new Product(id, name, price);*/
		System.out.println("Enter the ID:, Enter Name:, Enter Price:");
	    al.add(new Product(1,"HP Laptop",25000f));  
	    al.add(new Product(2,"Dell Laptop",30000f));  
	    al.add(new Product(3,"Lenevo Laptop",28000f));  
	    al.add(new Product(4,"Sony Laptop",28000f));
	    al.add(new Product(5,"Apple Laptop",90000f));
		 for(Product plist : al) 
		{
			 System.out.println(plist);
	     }
		 System.out.println();
		// Q1: Print all the product which have price less than  30000.
		  for (Product p_price: al)
		  {
	            if (p_price.getPrice() < 30000) 
	            {
	             System.out.println("Price < 30000"+ p_price);;
	            }
	        }
		  System.out.println();
		  // Q2: Print all the product name only which have price equel to  90000f.
		  for(Product prlist : al) 
		  {
			  if(prlist.getPrice() == 90000)
			  {
				  System.out.println(prlist);
			  }
		  }
		  System.out.println();
		  // Q3: Find  the sum of price of all products.
			  // [(Hint:  use map and reduce  )]
		  Double totalprice = al.stream().map(product -> product.getPrice())
				  .reduce(0.0, (sum, price) -> (sum + price));
		  System.out.println("Sum of Price :"+totalprice);
		  
		  // Q4: Find  the sum of price of all products.
		  //     [(Hint:  useCollectors  )]
		  System.out.println();
		  
		  // Q5: finds min and max product price by using stream.
		  System.out.println(al.stream().mapToDouble(product -> product.getPrice()).min());
		  System.out.println(al.stream().mapToDouble(product -> product.getPrice()).max());
		  
		  System.out.println();
		  // Q6: Print the count of product which r having price less than 30000f
		  //     [use filter and count]
		  //.out.println(al.stream().map(product -> product.getPrice() <= 30000).count());
		  System.out.println(al.stream().filter(product -> product.getPrice() < 30000).count());
          System.out.println();
          // Q7:
         // Converting product List into Set by adding   product having price less than 30000f in set
        //	 [hint : use filer map and Collectors.toSet()) function ]
          
          //  Set<String> set = convertListToSet(list);
          Set<Boolean> pprice_list = al.stream().map(p1 -> (p1.getPrice() < 30000)).collect(Collectors.toSet());
        		 // .map(p1 -> new Product(p1.getId(), p1.name, p1.price))
        		  //.collect(Collectors.toSet()); 
          System.out.println(pprice_list);
          

	}//end of main()

}// end of class
