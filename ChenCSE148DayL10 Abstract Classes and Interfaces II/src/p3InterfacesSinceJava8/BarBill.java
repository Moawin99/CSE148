package p3InterfacesSinceJava8;

public class BarBill implements Billable {
	private double amount;

	public BarBill(double amount) {
		this.amount = amount;
	}
	
//	@Override
//	public double getTipAmount() {
//		return (amount * TAX_RATE + amount) * TIP_RATE;
//	}

	@Override
	public double getAmount() {
		return amount;
	}

	@Override
	public double getTaxAmount() {
		return amount * TAX_RATE;
	}

}
