package p1;

public class Final {
	private int grammarScore;
	private int spellingScore;
	private int lengthScore;
	private int contentScore;

	private static final double GRAMMAR_WEIGHT = 0.3;
	private static final double SPELLING_WEIGHT = 0.2;
	private static final double LENGTH_WEIGHT = 0.2;
	private static final double CONTENT_WEIGHT = 0.3;

	public Final(int grammarScore, int spellingScore, int lengthScore, int contentScore) {
		super();
		this.grammarScore = grammarScore;
		this.spellingScore = spellingScore;
		this.lengthScore = lengthScore;
		this.contentScore = contentScore;
	}
	
	public double getFinalScore() {
		double finalScore = (grammarScore * GRAMMAR_WEIGHT
							+ spellingScore * SPELLING_WEIGHT
							+ lengthScore * LENGTH_WEIGHT
							+ contentScore * CONTENT_WEIGHT);
		return finalScore;
	}

}
