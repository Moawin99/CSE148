package classes_objects;

public class Eraser {
	// attributes, properties, instance variables
	private int weight;  //default access 
	private String color;
	
	// behavior, methods
	public void erase() {
		System.out.println("I erased the board!");
	}
	
	public void erase(int n) {
		System.out.println("I erased the board " + n +
							" times");
	}
	
	public void setWeight(int w) {
		weight = w;
	}
	
	public void showWeight() {
		System.out.println("The weight is " + weight);
	}
	
}
