/**
 * 
 * @author Nijel Felder
 * @version
 */
public class Rims extends VehicleDecorator{

	Vehicle vehicle;
	
	/**
	 * Retrieve the vehicle type
	 * @param Rims
	 */
	public Rims(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
	@Override
	/**
	 * Retrieve the string cool rims
	 * @return setting the string that presents cool rims
	 */
	public String toString() {
		return vehicle.toString() + ", cool rims";
	}
	
	@Override
	/**
	 * Retrieve the cost + add of Rims
	 * @return setting the cost of the vehicle
	 */
	public double getCost() {
		return vehicle.getCost() + 200.00;
	}
}
