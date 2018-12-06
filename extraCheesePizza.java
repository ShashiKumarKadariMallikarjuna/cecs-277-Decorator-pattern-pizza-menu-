package assignment7p2;
/**Extra cheese decorator 
 * @author Shashi Kumar Kadari Mallikarjuna
 * @version Assignment 7 part 2
 * @since Due - 11/5/18
 */
public class extraCheesePizza extends pizzaDecorator {
	/**overloaded constructor
	 * @param newPizza
	 */
	public extraCheesePizza(pizza newPizza) {
		super(newPizza);
	}
	/** method that returns the pizza*/
	public String Pizza() {
		return super.Pizza()+" with Extra Cheese";
	}

}
