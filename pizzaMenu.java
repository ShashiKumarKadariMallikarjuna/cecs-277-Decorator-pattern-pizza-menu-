package assignment7p2;

import java.util.Scanner;
/**main class which test the decorator pattern design
 * @author Shashi Kumar Kadari Mallikarjuna
 * @version Assignment 7 part 2
 * @since Due - 11/5/18
 */
public class pizzaMenu {
	/**main method
	 * @param args
	 */
	public static void main(String [] args) {
		int choice=0;
		while(choice!=4) {
			choice=menu();
			if(choice==1) {
				pizza p=new pepperoniPizza((pizza) new simplePizza());
				System.out.println("\n"+p.Pizza()+"\n");
				
			}
			else if(choice==2) {
				pizza p=new extraCheesePizza((pizza) new simplePizza());
				System.out.println("\n"+p.Pizza()+"\n");
			}
			else if(choice==3) {
				pizza p=new sausagePizza((pizza) new simplePizza());
				System.out.println("\n"+p.Pizza()+"\n");
			}
			else {
				System.out.println("\nThank you");
			}
		}
	}
	/**method that returns the user choice
	 * @return user option
	 */
	public static int menu() {
		int choice=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("===========Pizza Menu===========");
		System.out.println("1.Pepperoni Pizza");
		System.out.println("2.Extra Cheese Pizza");
		System.out.println("3.Sausage Pizza");
		System.out.println("4.Checkout");
		System.out.print("Enter your option:  ");
		choice=sc.nextInt();
		while(choice<1 && choice>4) {
			System.out.print("Invalid option. Please make a valid selection:  ");
			choice=sc.nextInt();
		}
		return choice;
	}
}
