package p1grades;

public class Demo {

	public static void main(String[] args) {
		Student student = new Student();
		Student[] students = new Student[10];
		Grading grading = new Grading(students);
		//based on final 60%, midterm 40% of the final grade
		System.out.println(name + id + grading.getLetterGrade());
	}

}
