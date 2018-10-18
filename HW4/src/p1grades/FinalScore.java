package p1grades;

public class FinalScore extends GradingActivity{

	private static final double GRAMMAR_WEIGHT = 0.3;
	private static final double SPELLING_WEIGHT = 0.2;
	private static final double LENGTH_WEIGHT = 0.2;
	private static final double CONTENT_WEIGHT = 0.3;

	public FinalScore(double grammarScore, double spellingScore, double lengthScore, double contentScore) {
		super();
		setScore(grammarScore * GRAMMAR_WEIGHT + 
				spellingScore * SPELLING_WEIGHT +
				lengthScore * LENGTH_WEIGHT +
				contentScore * CONTENT_WEIGHT);
	}

}
