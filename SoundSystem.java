/**
 * 
 * @author Nijel Felder
 * @version
 *
 */
public class SoundSystem extends VehicleDecorator {
	
	Vehicle vehicle;
	
	/**
	 * Retrieve the data type
	 * @param Sound System
	 */
	public SoundSystem(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
	@Override
	/**
	 * Retrieve the string awesome sound
	 * @return setting the string that presents awesome sound
	 */
	public String toString() {
		return vehicle.toString() + ", awesome sound";
	}
	
	@Override
	/**
	 * Retrieve the cost + add on SoundSystem
	 * @return setting the cost of the soundsystem
	 */
	public double getCost() {
		return vehicle.getCost() + 350.00;
	}

}
