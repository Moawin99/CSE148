package p1_Abstract_Classes;

public class Midterm implements GradingActivity {
	private double score;
	private int totalNumberOfQuestions;
	private int numberOfCorrectAnswers;
	
	public Midterm(int totalNumberOfQuestions, int numberOfCorrectAnswers) {
		this.numberOfCorrectAnswers = numberOfCorrectAnswers;
		this.totalNumberOfQuestions = totalNumberOfQuestions;
		this.score = numberOfCorrectAnswers * 100.0 / totalNumberOfQuestions;
	}

	@Override
	public double getScore() {
		return score * 1.5;
	}

	@Override
	public void setScore(double score) {
		this.score = score;
	}
	
	// @Override
	// public void showScore() {
	// System.out.println("The score is not that high");
	// }

}
