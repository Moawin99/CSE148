package toll_booth_app;

public class Car extends Vehicle implements Chargeable {
	private int numberOfDoors;

	public Car(int numberOfDoors) {
		super();
		this.numberOfDoors = numberOfDoors;
	}

	@Override
	public String getLicensePlate() {
		return super.getLicensePlate().toLowerCase();
	}

	@Override
	public double payToll() {
		return numberOfDoors * 2.0;
	}

	@Override
	public String toString() {
		return "Car:" + super.toString() + "LicensePlate= " + getLicensePlate() + ", Doors=" + numberOfDoors;
	}

}
