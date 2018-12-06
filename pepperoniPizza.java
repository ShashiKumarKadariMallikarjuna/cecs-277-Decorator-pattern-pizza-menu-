package assignment7p2;
/**Pepperoni decorator 
 * @author Shashi Kumar Kadari Mallikarjuna
 * @version Assignment 7 part 2
 * @since Due - 11/5/18
 */
public class pepperoniPizza extends pizzaDecorator {
	/**overloaded constructor
	 * @param newPizza
	 */
	public pepperoniPizza(pizza newPizza) {
		super(newPizza);
	}
	/** method that returns the pizza*/
	public String Pizza() {
		return super.Pizza()+" with Pepperoni";
	}
}
