package p2OInterfaces;

public interface Billable {
	
	// all variables in an interface are public static final
	double AMOUNT = 100;
	
	// all methods in an interface are public and abstract
	double getAmount();
	double getTaxAmount();
}
