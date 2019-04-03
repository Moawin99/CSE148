package p5;

public class BillableBag {
	private Billable[] arr;
	private int nElems;

	public BillableBag(int maxSize) {
		arr = new Billable[maxSize];
		nElems = 0;
	}
	
	public void insert(Billable billable) {
		arr[nElems++] = billable;
	}
	
	public double totalBillableAmount() {
		double total = 0;
		for(int i = 0; i < nElems; i++) {
			total += arr[i].bill();
		}
		return total;
	}
}
