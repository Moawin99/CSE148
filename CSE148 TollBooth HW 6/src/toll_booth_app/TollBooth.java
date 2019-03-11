package toll_booth_app;

public class TollBooth {
	private ChargeableBag theBag;
	
	public TollBooth(ChargeableBag theBag) {
		this.theBag = theBag;
	}
	
	public double getTotalToll() {
		double totalToll = 0;
		for(int i = 0; i < theBag.getNElems(); i++) {
			totalToll += theBag.getChargeableArray()[i].payToll();
		}
		return totalToll;
	}

}
