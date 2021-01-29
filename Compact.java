/**
 * 
 * @author Nijel Felder
 * @version
 *
 */
public class Compact extends Vehicle{

	/**
	 * Retrieve the description Compact
	 * @param Compact
	 */
	public Compact() {
		this.description = "Compact";
	}
	
	@Override
	/**
	 * Retrieve the cost of the Compact
	 * @return return the cost of $15000
	 */
	public double getCost() {
		return 15000.00;
	}
}
