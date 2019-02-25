package p1;

public class Midterm {
	private int totalQuestions;
	private int correctAnswers;

	public Midterm(int totalQuestions, int correctAnswers) {
		super();
		this.totalQuestions = totalQuestions;
		this.correctAnswers = correctAnswers;
	}

	public double getMidtermScore() {
		return (double) (correctAnswers) / totalQuestions * 100;
	}
}
