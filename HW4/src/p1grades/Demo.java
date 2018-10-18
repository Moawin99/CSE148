package p1grades;

public class Demo {
	private static final int NUMBER_OF_STUDENTS = 5;
	private static Student[] students = new Student[NUMBER_OF_STUDENTS];
	private static String[][] rawData;

	public static void main(String[] args) {
		rawData = fillData();// get input
		calculateGrades(); // process data
		showOutput(); // provide output
	}

	private static void calculateGrades() {
		for (int i = 0; i < rawData.length; i++) {
			int j = 0;
			String name = rawData[i][j++];
			String id = rawData[i][j++];
			int totalNumberOfQuestions = Integer.parseInt(rawData[i][j++]);
			int numberOfCorrectAnswers = Integer.parseInt(rawData[i][j++]);
			int grammarScore = Integer.parseInt(rawData[i][j++]);
			int spellingScore = Integer.parseInt(rawData[i][j++]);
			int lengthScore = Integer.parseInt(rawData[i][j++]);
			int contentScore = Integer.parseInt(rawData[i][j++]);

			students[i] = new Student(name, id, totalNumberOfQuestions, 
					numberOfCorrectAnswers, grammarScore,
					spellingScore, lengthScore, contentScore);
		}
	}

	private static void showOutput() {
		System.out.printf("%-10s%10s%15s\n", "Full Name", "ID", "LetterGrade");
		for (int i = 0; i < students.length; i++) {
			System.out.printf("%-10s%10s%15c\n", students[i].getName(), students[i].getId(),
					students[i].getLetterGrade());
		}
	}

	private static String[][] fillData() {
		String[][] rawData = { 
				{ "Alan", "111", "20", "9", "56", "59", "59", "59" },
				{ "Beth", "222", "30", "19", "67", "65", "65", "60" },
				{ "Cate", "333", "20", "19", "90", "95", "90", "95" },
				{ "Dave", "444", "30", "25", "85", "85", "85", "80" },
				{ "Frank", "555", "40", "40", "90", "90", "90", "80" } 
				};
		return rawData;
	}

}
