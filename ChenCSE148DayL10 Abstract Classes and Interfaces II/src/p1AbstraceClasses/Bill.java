package p1AbstraceClasses;

public abstract class Bill { // not a concrete class
	private double amount;

	protected abstract double getAmount();
	protected abstract double getTaxAmount();
}
