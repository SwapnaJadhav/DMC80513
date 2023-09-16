/*Display food menu to user. User will select items from menu along with the
quantity. (eg 1. Dosa 2. Samosa 3. Idli ... 10 . Generate Bill ) Assign fixed
prices to food items(hard code the prices) When user enters 'Generate Bill'
option , display total bill & exit.*/

import java.util.Scanner;

public class Food_menu {
	
	 void display() {
	        System.out.println("1. Tea (Rs. 10)");
	        System.out.println("2. Green Tea (Rs. 15)");
	        System.out.println("3. Samosa (Rs. 20)");
	        System.out.println("4. Sandwhich (Rs. 50)");
	        System.out.println("5. Generate Bill and Exit");
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Menu Options in Shop");
        Food_menu mobj= new Food_menu();

        int sum = 0;
        while (true) {
            mobj.display();
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.println("Enter quantity:");
                    int a = sc.nextInt();
                    sum = sum + 10 * a;
                    break;

                case 2:
                    System.out.println("Enter quantity:");
                    int b = sc.nextInt();
                    sum = sum + 15 * b;
                    break;
                case 3:
                    System.out.println("Enter quantity:");
                    int c = sc.nextInt();
                    sum = sum + 20 * c;
                    break;

                case 4:
                    System.out.println("Enter quantity:");
                    int d = sc.nextInt();
                    sum = sum + 50 * d;
                    break;
                default:
                    System.out.println("Total Bill : " +sum);
                    break;

            }
        }

	}//end of method

}//end of Class
