import java.util.Scanner;

public class Pro5_2_150117011 {
/*
 * Buse Batman-150117011
 * I made this program that tests whether a two-dimensional list
 * has seven-length string “CSE1141” either horizontally, vertically or diagonally 
 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Prompt the user to enter the row and columns number
		System.out.print("Please enter the number of rows:");
		int row = input.nextInt();
		System.out.print("Please enter the number of columns:");
		int col = input.nextInt();
		System.out.println();
		//Creating characters as a one string
		String characters = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		//Creating an array based on users choice
		char[][] table = new char[row][col];
		//Filling the array with random characters
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++)
				table[i][j] = characters.charAt((int) (Math.random() * characters.length()));
		}
		//Printing the array
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(table[i][j] + " ");
			}
			System.out.println();
		}

		// Checking verticals
		for (int i = 0; i < row; i++) {
			String horizontal = "";
			for (int j = 0; j < col; j++) {
				horizontal += table[i][j];
			}
			checkContains(horizontal);
		}

		// Checking horizontals
		for (int j = 0; j < col; j++) {
			String vertical = "";
			for (int i = 0; i < row; i++) {
				vertical += table[i][j];
			}
			checkContains(vertical);
		}

		// Checking diagonals, starting from first column
		for (int _i = 0; _i < row; _i++) {
			int i = _i;
			int j = 0;
			String diagonal = "";
			while (i != row && j != col) {
				diagonal += table[i][j];
				i++;
				j++;
			}
			checkContains(diagonal);

			diagonal = "";
			i = _i;
			j = 0;
			while (i != 0 && j != col) {
				diagonal += table[i][j];
				i--;
				j++;
			}
			checkContains(diagonal);
		}

		// Checking diagonals, starting from first row
		for (int _j = 0; _j < col; _j++) {
			int i = 0;
			int j = _j;
			String diagonal = "";
			while (i != row && j != col) {
				diagonal += table[i][j];
				i++;
				j++;
			}
			checkContains(diagonal);
		}

		// Checking diagonals, starting from last row
		for (int _j = 0; _j < col; _j++) {
			int i = row - 1;
			int j = _j;
			String diagonal = "";
			while (i != 0 && j != col) {
				diagonal += table[i][j];
				i--;
				j++;
			}
			checkContains(diagonal);
		}
		//If array doesn't contain CSE1141 print false
		System.out.println("\nFALSE");
		input.close();
	}
	//If array contains CSE1141 prints true
	private static void checkContains(String str) {
		if (str.contains("CSE1141") || str.contains("1411ESC")) {
			System.out.println("\nTRUE");
			System.exit(0);
		}
	}
}