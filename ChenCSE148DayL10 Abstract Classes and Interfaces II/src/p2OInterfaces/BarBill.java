package p2OInterfaces;

public class BarBill implements Billable{
	private double billAmount;
	private static final double TAX_RATE = 0.08625;
	
	public BarBill(double amount) {
		billAmount = amount;
	}
	
	public double getTotalAmount() {
		return billAmount + getTaxAmount();
	}
	
	@Override
	public double getAmount() {
		return billAmount;
	}

	@Override
	public double getTaxAmount() {
		return billAmount * TAX_RATE;
	}

}
