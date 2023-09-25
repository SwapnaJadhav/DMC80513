package Tester;

import java.util.Scanner;

import com.app.fruits.Apple;
import com.app.fruits.Fruits;
import com.app.fruits.Mango;
import com.app.fruits.Orange;

public class FruitBasket 
{

	public static void main(String[] args) 
	{
		
		Fruits f = new Fruits();
		System.out.println(f);
		Orange o = new Orange("Orange", 5, "Nagpur Orange");// color and name is known
		System.out.println(o);

		Mango m = new Mango("Yellow", 20, "Hapus");// color and name is known
		m.disp();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a basket size: ");
		int basket_size = sc.nextInt();

		Fruits basket[] = new Fruits[basket_size];
		int choice;
		int count = 0;
		
		do {

			System.out.println("Enter the choice:");
			choice = sc.nextInt();

			System.out.println("1.Add Mango 2.Orange 3.Apple 4.Name of all fruit 5.name, color, weight , taste all fruits 6.taste of all stale fruits"
					+ "7.mark fruit at index stale 8.Marks all sour fruits stale 10.Exit");
			switch (choice) {
			case 1:
				System.out.println("Enter the Mango: color,weight,name");
				//String m1 = sc.next();
				if (count < basket_size) {
//					System.out.println("Enter color:");
//					String mc= sc.next();
//					System.out.println("Enter weight:");
//					double mw= sc.nextDouble();
//					System.out.println("Enter name:");
//					String mn= sc.next();
					basket[count++] = new Orange(sc.next(), sc.nextDouble(), sc.next());
					// basket[count] = new Mango("Mango", 20, "Yellow");
					// basket[count].disp();
					// count++;
				} else 
				{
					System.out.println("Basket is full");
				}

				break;

			case 2:
				System.out.println("Enter the Orange: ");
				if (count < basket_size) {
					// String or =sc.next();
					basket[count++] = new Orange(sc.next(), sc.nextDouble(), sc.next());
					// basket[count++] = new Orange("Orange", 2, "NagpurOrange");
				} else {
					System.out.println("Basket is full");
				}

				break;

			case 3:

				System.out.println("Enter the Apple: ");
				if (count < basket_size) 
				{
					// String ap =sc.next();
					basket[count++] = new Apple(sc.next(), sc.nextDouble(), sc.next());
					// basket[count++] = new Orange("Apple", 2, "NagpurOrange");

				} else 
				{
					System.out.println("Basket is full");
				}

				break;

			case 4:
				System.out.println("All Fruits: ");
				for (Fruits f2 : basket)
				{
					if (f2 != null)
						System.out.println(f2.getName());
				}

				break;

			case 5:
				System.out.println("Display name,color,weight ");

				for (Fruits fruits : basket)
				{
					if (fruits != null) 
					{
						fruits.disp();

					}
				}
				break;

			case 6:
				for (Fruits fruits : basket)
				{

					if (fruits != null && fruits.isFresh() == false) 
					{
						System.out.println(fruits.taste());
					}
				}
				break;

			case 7:
//				 Mark a fruit as stale
//				 i/p : index
//				 eg : setter : isFresh : false
//				 o/p : error message (in case of invalid index) or mark it stale
//				
				int i = sc.nextInt();
				if (basket[i] != null) 
				{
					basket[i].setFresh(false);
				}

				break;
				
			case 8:
//				Mark all sour fruits stale (optional)
//				eg : for-each , taste --equals(String)
				
				for (Fruits fruits : basket) 
				{
					if(fruits!=null&& fruits.taste().equals("sour")) 
					{
						fruits.setFresh(false);
					}
				}
				break;
				
			case 10: System.out.println("Exit");	
			break;

			}// end of switch

		} while (choice != 10);

		sc.close();
	}// end of main()

}// end of class