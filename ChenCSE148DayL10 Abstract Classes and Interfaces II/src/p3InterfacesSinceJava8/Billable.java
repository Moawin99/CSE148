package p3InterfacesSinceJava8;

public interface Billable {
	
	// all variables in an interface are public static final
	double AMOUNT = 100;
	double TAX_RATE = 0.08625;
	double TIP_RATE = 0.2;
	
	// all methods in an interface are public and abstract
	double getAmount();
	double getTaxAmount();
		
	static double getTipAmount() {
		return (AMOUNT * TAX_RATE + AMOUNT) * TIP_RATE;
	}
}
