package p1Inheritance;

public class Golden extends Dog {
	private double weight;

	public Golden(String name, int age, String breed, double weight) {
		super(name, age, breed);
		this.weight = weight;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return super.toString() + ", weight=" + weight;
	}
	
	
}
