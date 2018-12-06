package assignment7p2;
/** Pizza decorator
 * @author Shashi Kumar Kadari Mallikarjuna
 * @version Assignment 7 part 2
 * @since Due - 11/5/18
 */
public abstract class pizzaDecorator implements pizza {
	private pizza newPizza;
	/**overloaded constructor
	 * @param newPizza
	 */
	public pizzaDecorator( pizza newPizza) {
		this.newPizza= newPizza;
	}
	/** method that returns the pizza*/
	public String Pizza() {
		 return newPizza.Pizza();
	}
}
