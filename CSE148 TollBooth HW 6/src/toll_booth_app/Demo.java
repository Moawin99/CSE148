package toll_booth_app;

public class Demo {

	public static void main(String[] args) {
		Car car1 = new Car(2);
		Bus bus1 = new Bus(20);
		Bike bike1 = new Bike(BikeType.RACING);
		ChargeableBag theBag = new ChargeableBag(5);
		theBag.insert(car1);
		theBag.insert(bus1);
		theBag.insert(bike1);
		TollBooth theBooth = new TollBooth(theBag);
		System.out.println(theBooth.getTotalToll());
		System.out.println(car1);
		System.out.println(bus1);
	}

}
