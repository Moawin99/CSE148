package toll_booth_app;

public class ChargeableBag {
	private Chargeable[] arr;
	private int nElems;
	
	public ChargeableBag(int maxSize) {
		arr = new Chargeable[maxSize];
		nElems = 0;
	}
	
	public void insert(Chargeable chargeable) {
		arr[nElems++] = chargeable;
	}
	
	public int getNElems() {
		return nElems;
	}
	
	public Chargeable[] getChargeableArray() {
		return arr;
	}
	
	public void displayBag() {
		for(int i = 0; i < nElems; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
	}
}
