package p1;

public class Student {
	private String name;
	private String id;
	private Midterm midterm;
	private Final finalExam;

	private static int idCounter = 1;

	private static final double MIDTERM_WEIGHT = 0.4;
	private static final double FINAL_WEIGHT = 0.6;

	public Student(String name, int totalQuestions, int correctAnswers, int grammarScore, int spellingScore,
			int lengthScore, int contentScore) {
		super();
		this.name = name;
		String rawId = String.valueOf(idCounter++);
		this.id = convertID(rawId);
		this.midterm = new Midterm(totalQuestions, correctAnswers);
		this.finalExam = new Final(grammarScore, spellingScore, lengthScore, contentScore);
	}

	private String convertID(String rawId) {
		String id = rawId;
		int originalLength = rawId.length();
		for (int i = originalLength; i < 3; i++) {
			id = "0" + id;
		}
		return id;
	}

	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}

	private double getTotalScore() {
		return midterm.getMidtermScore() * MIDTERM_WEIGHT + finalExam.getFinalScore() * FINAL_WEIGHT;
	}

	public String getLetterGrade() {
		double totalScore = getTotalScore();
		if (totalScore >= 90) {
			return "A";
		} else if (totalScore >= 80) {
			return "B";
		} else if (totalScore >= 70) {
			return "C";
		} else if (totalScore >= 60) {
			return "D";
		} else {
			return "F";
		}
	}

}
