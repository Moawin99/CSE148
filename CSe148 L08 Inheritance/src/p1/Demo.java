package p1;

public class Demo {

	public static void main(String[] args) {
		Address address1 = new Address("1", "Main St.", "Selden", "NY", "11784");
		
		// polymorphism
		Person s1 = new Student("John", 111, address1, 4.0);
		Person f1 = new Faculty("Jane", 222, address1, 1000);
		Person[] persons = new Person[2];
		persons[0] = s1;
		persons[1] = f1;
		for(int i = 0; i < 2; i++) {
			if(persons[i] instanceof Student) {
				System.out.println(persons[i].getName() + " is a student!");
			} else if (persons[i] instanceof Faculty){
				System.out.println(persons[i].getName() + " is a Faculty!");
			} else {
				System.out.println(persons[i].getName() + " is neither");
			}
		}
	}

}
