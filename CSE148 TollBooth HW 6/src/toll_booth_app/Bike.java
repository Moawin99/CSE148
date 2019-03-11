package toll_booth_app;

public class Bike implements Chargeable {
	private BikeType bikeType;

	public Bike(BikeType type) {
		this.bikeType = type;
	}

	@Override
	public double payToll() {
		if (bikeType == BikeType.MOUNTAIN) {
			return 1.0;
		} else if (bikeType == BikeType.RACING) {
			return 3.0;
		} else
			return 2.0;
	}

}
