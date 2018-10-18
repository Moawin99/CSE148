package p1grades;

public class MidtermScore extends GradingActivity {

	public MidtermScore(int totalNumberOfQuestions, int numberOfCorrectAnswers) {
		super();
		setScore(numberOfCorrectAnswers * 100.0 / totalNumberOfQuestions);
	}

}
