package p1grades;

public class Student {
	private String name;
	private String id;
	private MidtermScore midtermScore;
	private FinalScore finalScore;
	private double combinedScore;
	private char letterGrade;

	private static final double MIDTERM_WEIGHT = 0.4;
	private static final double FINAL_WEIGHT = 0.6;

	public Student(String name, String id, int numberOfCorrectAnswers, int totalNumberOfQuestions, int grammarScore,
			int spellingScore, int lengthScore, int contentScore) {
		super();
		this.name = name;
		this.id = id;
		this.midtermScore = new MidtermScore(numberOfCorrectAnswers, totalNumberOfQuestions);
		this.finalScore = new FinalScore(grammarScore, spellingScore, lengthScore, contentScore);
		combinedScore = midtermScore.getScore() * MIDTERM_WEIGHT + finalScore.getScore() * FINAL_WEIGHT;
		letterGrade = convertToLetterGrade();
	}

	public char getLetterGrade() {
		return letterGrade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public char convertToLetterGrade() {
		if (combinedScore >= 90) {
			letterGrade = 'A';
		} else if (combinedScore >= 80) {
			letterGrade = 'B';
		} else if (combinedScore >= 70) {
			letterGrade = 'C';
		} else if (combinedScore >= 60) {
			letterGrade = 'D';
		} else {
			letterGrade = 'F';
		}

		return letterGrade;
	}

}
