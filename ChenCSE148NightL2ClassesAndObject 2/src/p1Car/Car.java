package p1Car;

public class Car { // class name is a noun
	// instance variables, data fields, fields, attributes, properties
	// meant to store the state of future objects (nouns)
	private String make;
	private int year;
	private double price;
	private String color;
	private int speed;

	// methods, behavior, instance methods
	// meant to describe the action or behavior or future objects (verbs)
	public Car(String make, int year, double price, String color) { // parameters
		this.make = make;
		this.year = year;
		this.price = price;
		this.color = color;
	}

	public Car() {
	}

	public void speedUp(int speed) {
		this.speed += speed;
	}

	public void slowDown(int speed) {
		this.speed -= speed;
	}

	public int getSpeed() {
		return speed;
	}

	// overloaded methods
	public void setSpeed(int speed) {
		this.price = speed;
	}
	
	public void setSpeed(double s) {
		this.speed = (int) s; // casting
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Car [make=" + make + ", year=" + year + ", price=" + price + ", color=" + color + "]";
	}

}
