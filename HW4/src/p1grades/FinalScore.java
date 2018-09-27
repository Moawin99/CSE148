package p1grades;

public class FinalScore extends GradingActivity{
	private double grammarScore;
	private double spellingScore;
	private double lengthScore;
	private double contentScore;

	private static final double GRAMMAR_WEIGHT = 0.3;
	private static final double SPELLING_WEIGHT = 0.2;
	private static final double LENGTH_WEIGHT = 0.2;
	private static final double CONTENT_WEIGHT = 0.3;

	public FinalScore(double grammarScore, double spellingScore, double lengthScore, double contentScore) {
		super();
		this.grammarScore = grammarScore;
		this.spellingScore = spellingScore;
		this.lengthScore = lengthScore;
		this.contentScore = contentScore;
	}

}
