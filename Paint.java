/**
 * 
 * @author Nijel Felder
 * @version
 */
public class Paint extends VehicleDecorator{
	
	Vehicle vehicle;
	
	/**
	 * Retrieve the data type
	 * @param Paint
	 */
	public Paint(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	@Override
	/**
	 * Retrieve the string fancy paint
	 * @return setting the string that presents fancy paint
	 */
	public String toString() {
		return vehicle.toString() + ", fancy paint";
	}
	
	@Override
	/**
	 * Retrieve the cost + add on of Paint
	 * @return setting the cost of the paint
	 */
	public double getCost() {
		return vehicle.getCost() + 150.00;
	}
}
