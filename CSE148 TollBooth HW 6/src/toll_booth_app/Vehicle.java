package toll_booth_app;

import toll_booth_utils.TollUtils;

public abstract class Vehicle {
	private String make;
	private String year;
	private String color;
	private String vin;
	private String licensePlate;
	
	public Vehicle() {
		this.make = TollUtils.pickMake();
		this.year = TollUtils.pickYear();
		this.color = TollUtils.pickColor();
		this.vin = TollUtils.makeVin();
		this.licensePlate = TollUtils.makeLicensePlate();
	}

	@Override
	public String toString() {
		return "Vehicle [make=" + make + ", year=" + year + ", color=" + color + ", vin=" + vin + "]";
	}

	public String getLicensePlate() {
		return licensePlate;
	}
	
	
	
}
