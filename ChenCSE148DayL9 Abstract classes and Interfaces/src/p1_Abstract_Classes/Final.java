package p1_Abstract_Classes;

public class Final implements GradingActivity {
	private double score;
	private int grammarScore;
	private int spellingScore;
	private int lengthScore;
	private int contentScore;
	
	private final double GS_WEIGHT = 0.3;
	private final double SS_WEIGHT = 0.2;
	private final double LS_WEIGHT = 0.2;
	private final double CS_WEIGHT = 0.3;
	
	
	public Final(int gs, int ss, int ls, int cs) {
		grammarScore = gs;
		spellingScore =ss;
		lengthScore = ls;
		contentScore = cs;
		score = gs * GS_WEIGHT + ss * SS_WEIGHT + ls * LS_WEIGHT + cs * CS_WEIGHT;
	}

	@Override
	public void setScore(double score) {
		this.score = score;
	}

	@Override
	public double getScore() {
		return score * 1.1;
	}

}
