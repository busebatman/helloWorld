import java.util.Scanner;

public class Pro4_150117011 {

	public static void main(String[] args) {
		/* Buse Batman
		 * 150117011
		 */
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter an input string: ");
		String message = input.nextLine();
		if(message.charAt(0)=='e' && message.charAt(1)=='x' && message.charAt(2)=='i' && message.charAt(3)=='t'){
			System.out.print("Program ends. Bye");
			System.exit(0);
		}
		else if(message.charAt(0)=='s' && message.charAt(1)=='t' && message.charAt(2)=='a' && message.charAt(3)=='t'){
			System.out.print("Program ends. Bye");
			System.exit(0);
		}
		else{
		System.out.println(
				"1. Change Case \n2. Count vowels and consonants \n3. Capitalize the first letter \n4. Encrypt or Decrypt \n");
		System.out.print("Please select an option: ");
		int caseNumber = input.nextInt();
	}
	}
	int totalNumbers = 0;
	int totalWords = 0;
   
	public static int updateLetterCount(int count, String str) {
		for (int i = 0; i < str.length(); i++)
			if (Character.isLetter(i))
				count++;
		return count;
	}

	public static void printStat(int wordCount, int letterCount) {
		System.out.println("The number of words: " + wordCount);
		System.out.println("The number of alphabetic letters: " + letterCount);
	}

	public static String changeCase(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (Character.isLowerCase(i))
				Character.toUpperCase(str.charAt(i));
			else if (Character.isUpperCase(i))
				Character.toLowerCase(str.charAt(i));
			return str;
		}
	}

	public static void countVC(String str) {
		int vowel = 0;
		int constonant = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' && str.charAt(i) == 'e' && str.charAt(i) == 'i' && str.charAt(i) == 'o'
					&& str.charAt(i) == 'u')
				vowel++;
			else if (Character.isLetter(i) && str.charAt(i) != 'a' && str.charAt(i) != 'e' && str.charAt(i) != 'i'
					&& str.charAt(i) != 'o' && str.charAt(i) != 'u')
				constonant++;
		}
	}

	public static String capitalize(String str) {
		for (int i = 0; i<str.length(); i++) {
			Character.toUpperCase(str.charAt(i));
			if (str.charAt(i) == ' ')
				Character.toUpperCase(str.charAt(i+1));
		}
		return str;
	}

	public static String encryptOrDecrypt(String str, int offset) {
		str.toUpperCase();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an offset value: ");
		offset = input.nextInt();
		return str;
	}
	
}