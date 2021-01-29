/**
 * 
 * @author Nijel Felder
 * @version
 *
 */
public class Sedan extends Vehicle {


	/**
	 * Retrieve the description Sedan
	 * @param Sedan
	 */
	public Sedan() {
		this.description = "Sedan";
	}
	
	@Override
	/**
	 * Retrieve the cost of the Sedan
	 * @return A double number
	 */
	public double getCost() {
		return 20000.00;
	}
}
