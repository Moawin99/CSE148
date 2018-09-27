package p1Inheritiance;

public class PartTimeStudent extends Student {
	private int numberOfCredits;
	private final double PRICE_PER_CREDIT = 280.00;
	private double parkingFees;

	public PartTimeStudent(String name, String ssn, double gpa, int numberOfCredits) {
		super(name, ssn, gpa);
		this.numberOfCredits = numberOfCredits;
	}
	
	public double getParkingFees() {
		return parkingFees;
	}

	public void setParkingFees(double parkingFees) {
		this.parkingFees = parkingFees;
	}

	public String getName() {
		return "Joe";
	}
	//not allowed because getGpa() is final
//	public double getGpa() {
//		return 3.6;
//	}

	public int getNumberOfCredits() {
		return numberOfCredits;
	}

	public void setNumberOfCredits(int numberOfCredits) {
		this.numberOfCredits = numberOfCredits;
	}

	public double getPRICE_PER_CREDIT() {
		return PRICE_PER_CREDIT;
	}

}
