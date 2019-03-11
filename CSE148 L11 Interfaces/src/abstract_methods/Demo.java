package abstract_methods;

public class Demo {

	public static void main(String[] args) {
		Chargeable s1 = new Student("John", 3.5);
		Chargeable f1 = new Faculty("John", 3500);
		Chargeable[] arr = new Chargeable[5];
		arr[0] = s1;
		arr[1] = f1;
		
	}

}
