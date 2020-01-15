import java.util.Scanner;

public class Pro5_1_150117011 {
	/*
	 * Buse Batman-150117011 I made this program to take the answers of each
	 * student and it will grade the exam based on the given key
	 */

	public static void main(String[] args) {
		System.out.println("Hello Teacher!");
		Scanner input = new Scanner(System.in);
		//Taking the answer key
		System.out.println("Please enter the answer key:");
		String keyStr = input.nextLine();
		//If answer key is less than 40 characters the program will give an error message
		while (keyStr.length() != 40) {
			System.out.println("Illegal Input!");
			System.out.println("Please enter the answer key:");
			keyStr = input.nextLine();
		}
		//Creating key array based on given key
		char[] key = new char[40];
		for (int i = 0; i < 40; i++) {
			key[i] = keyStr.charAt(i);
		}
		//Taking student's name and answers
		System.out.print("\nPlease enter the name of the student: ");
		String name = input.nextLine();
		////If answer key is less than 40 characters the program will give an error message
		while (!name.equals("0")) {
			System.out.println("Please enter the answers of " + name + ":");
			String answerStr = input.nextLine();
			if (answerStr.length() != 40) {
				System.out.println("Illegal Input!");
				//Creating new array based on student's anwers
			} else {
				char[] answer = new char[40];
				for (int i = 0; i < 40; i++) {
					answer[i] = answerStr.charAt(i);
				}
				//Calculating correct-incorrect answers and the percentage of success of each student in each subject
				int correct = 0;
				int incorrect = 40 - correct;
				int S1 = 0;
				int S2 = 0;
				int S3 = 0;
				int S4 = 0;
				for (int i = 0; i < 40; i++) {
					if (key[i] == answer[i]) {
						correct++;
						incorrect--;
						switch (i % 4) {
						case 0:
							S1++;
							break;
						case 1:
							S2++;
							break;
						case 2:
							S3++;
							break;
						case 3:
							S4++;
							break;
						}
					}
				}
				//Printing the results
				System.out.println("\n" + name + " has " + correct + " correct and  " + incorrect
						+ " incorrect answers in total.");
				System.out.println("The percentage of success is:");
				System.out.println("S1\tS2\tS3\tS4");
				System.out.println("---\t---\t---\t---");
				System.out.println(S1 * 10 + "%\t" + S2 * 10 + "%\t" + S3 * 10 + "%\t" + S4 * 10 + "%");
			}
			System.out.print("\nPlease enter the name of the student: ");
			name = input.nextLine();
		}
		//If user enter 0 as a student's name then program will quit.
		System.out.println("Program ends. Bye :)");
		input.close();
	}
}
