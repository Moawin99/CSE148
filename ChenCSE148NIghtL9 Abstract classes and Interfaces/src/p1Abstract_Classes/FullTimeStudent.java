package p1Abstract_Classes;

public abstract class FullTimeStudent extends Student {

	public FullTimeStudent(String name, double gpa) {
		super(name, gpa);
	}

	@Override
	public abstract void setName(String name);

}
