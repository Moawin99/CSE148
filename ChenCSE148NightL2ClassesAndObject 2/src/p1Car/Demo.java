package p1Car;

public class Demo {

	public static void main(String[] args) {
//		int n1 = 4;
//		int n2 = n1;
		
		Car car1 = new Car();
		System.out.println(car1.toString());
		
		Car car2 = new Car("Honda", 2018, 20200.95, "RED"); // arguments
		System.out.println(car2);
		car2.setColor("WHITE");
		
		Car car3;
		car3 = new Car();
		
		car3 = car2;
		car3.setColor("Black");
		System.out.println(car2.getColor());
		System.out.println(car1.getColor());
		
		car3 = car1; // shallow copy
		car2 = car1;
		Car car4 = new Car();
		
		
		System.out.println(car1.getColor());
		
		
//		
//		
//		
//		
//		System.out.println(car2);
//		System.out.println("The year of the second car is: " + car2.getYear());
//		System.out.println("The speed is " + car2.getSpeed());
//		car2.speedUp(30);
//		car2.speedUp(40);
//		System.out.println("The speed is " + car2.getSpeed());
//		car2.slowDown(50);
//		System.out.println("The speed is " + car2.getSpeed());
	}

}
