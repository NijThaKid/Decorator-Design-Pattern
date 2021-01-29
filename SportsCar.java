/**
 * 
 * @author Nijel Felder
 * @version
 *
 */
public class SportsCar extends Vehicle{

	/**
	 * Retrieve the description Sports Car
	 * @param Sports Car
	 */
	public SportsCar() {
		this.description = "Sports Car";
	}
	
	@Override
	/**
	 * Retrieve the cost of the SportsCar.
	 * @return return the cost of $30000
	 */
	public double getCost() {
		return 30000.00;
	}
}
