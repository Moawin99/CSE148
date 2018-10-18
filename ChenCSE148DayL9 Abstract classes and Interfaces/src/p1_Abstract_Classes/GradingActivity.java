package p1_Abstract_Classes;

public interface GradingActivity {
//public static variables are allowed but not instance variables
	public void setScore(double score);

	public double getScore();
	
	static void showScore() {
		System.out.println("The score is high!");
	}
}
