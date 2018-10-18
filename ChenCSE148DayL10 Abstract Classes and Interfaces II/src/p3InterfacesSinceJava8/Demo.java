package p3InterfacesSinceJava8;

public class Demo {

	public static void main(String[] args) {
//		Billable bill1 = new Billable(); // not okay
		
		BarBill bill1 = new BarBill(200);
		System.out.println(bill1.getAmount()); // from concrete class
		System.out.println(bill1.getTaxAmount()); // from concrete class
		System.out.println(Billable.getTipAmount()); // from interface
	}
	

}
