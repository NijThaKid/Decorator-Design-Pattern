/**
 * 
 * @author Nijel Felder
 * @version 
 *
 */
public abstract class Vehicle {

	protected String description;
	
	/**
	 * Retrieve the description.
	 * @return A String data type.
	 */
	public String toString() {
		return description;
	}
	
	public abstract double getCost();
	
}
