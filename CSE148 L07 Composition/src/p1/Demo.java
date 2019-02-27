package p1;

public class Demo {

	public static void main(String[] args) {
		Student s1 = new Student("Alan", 50, 40, 100, 90, 100, 80);
		Student s2 = new Student("Bill", 40, 26, 75, 80, 100, 60);
		Student s3 = new Student("Cate", 45, 39, 89, 94, 85, 89);
		Student s4 = new Student("Dave", 35, 30, 90, 45, 40, 68);
		Student s5 = new Student("Frank", 100, 73, 45, 56, 48, 62);
		System.out.println(s5.getName());
		System.out.println(s5.getId());
		System.out.println(s5.getLetterGrade());
	}

}
