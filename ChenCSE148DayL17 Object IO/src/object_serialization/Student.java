package object_serialization;

import java.io.Serializable;

public class Student extends Person implements Serializable{
	private String phone;
	private double gpa;

	public Student(String name, String gender, String phone, double gpa) 
									throws IllegalArgumentException{
		super(name, gender);
		if(gpa < 0.0 || gpa > 4.0) {
			throw new IllegalArgumentException("Bad GPA Value Entered");
		}
		
		if(phone.length() != 10) {
			throw new IllegalArgumentException("Bad Phone Number Entered");
		}
		this.phone = phone;
		this.gpa = gpa;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return super.toString() + ", phone=" + phone + ", gpa=" + gpa;
	}
	
	

	
}
