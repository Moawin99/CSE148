package defaultMethods;

public interface Chargeable {
	double chargeTuition();

	double chargeParking();

	double chargeActivities();
	
	default double chargeFood()  {
		return 100.00;
	}
	
	default double chargeSitting()  {
		return 50.00;
	}
	
	default double chargeStanding()  {
		return 500.00;
	}
}
