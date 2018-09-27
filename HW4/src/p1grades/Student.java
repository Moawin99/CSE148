package p1grades;

public class Student {
	private String name;
	private String id;
	private MidtermScore midtermScore;
	private FinalScore finalScore;
	private double totalScore;
	private char letterGrade;

	public Student(String name, String id, MidtermScore midtermScore, FinalScore finalScore) {
		super();
		this.name = name;
		this.id = id;
		this.midtermScore = midtermScore;
		this.finalScore = finalScore;
		
	}

	public char convertToLetterGrade() {
		if(totalScore >= 90) {
			letterGrade = 'A';
		} else if(totalScore >= 80) {
			letterGrade = 'B';
		} else if(totalScore >= 70) {
			letterGrade = 'C';
		} else if(totalScore >= 60) {
			letterGrade = 'D';
		} else {
			letterGrade = 'F';
		}
		
		return letterGrade;
	}
}
