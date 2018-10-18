package p2OInterfaces;

public class Demo {

	public static void main(String[] args) {
//		Billable bill1 = new Billable(); // not okay
		BarBill bill1 = new BarBill(100);
		System.out.println(bill1.getTotalAmount());
		
	}

}
