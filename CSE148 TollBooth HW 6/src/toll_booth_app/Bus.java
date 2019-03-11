package toll_booth_app;

public class Bus extends Vehicle implements Chargeable {
	private int numberOfSeats;

	public Bus(int numberOfSeats) {
		super();
		this.numberOfSeats = numberOfSeats;
	}
	
	@Override
	public String getLicensePlate() {
		return super.getLicensePlate().toUpperCase();
	}

	@Override
	public double payToll() {
		return 0.5 * numberOfSeats;
	}

	@Override
	public String toString() {
		return "Bus: " + super.toString() + "LicensePlate= " + getLicensePlate()  + ", numberOfSeats=" + numberOfSeats;
	}
	
	
	
}
