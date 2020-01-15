import java.util.Scanner;
public class Pro3_3_150117011 {

	public static void main(String[] args) {
		/* Buse Batman
		 * 150117011
		 I made this program to print a pattern with the user's input*/
		Scanner input = new Scanner(System.in);
		//Prompt the user to enter an integer
		System.out.print("Enter an input string: ");
		  String str = input.nextLine();
		  //Taking the length of the string
		  int inputLength = str.length();
		  //First string is the correct order
		  String line = str;
		  //Then the second string will be the reverse 
		  String reverseInput = "";
		  for (int i = 0; i < inputLength; i++) {
		  	reverseInput += str.charAt(inputLength - i - 1);
		  }
		  //The second string won't have first and last characters
		  for (int i = 1; i <= inputLength - 2; i++) {
			  //Adding the first and second string
		  	line += reverseInput.charAt(i); 
		  }
		   //Third string will have the correct order 
		  line += str;
		  // Last string will be the reverse but won't have the last character of the input
		  for (int i = 1; i <= inputLength - 1; i++) {
		  	line += reverseInput.charAt(i); 
		  }
		  //Then we print the first line and skip to next line
		  System.out.println(line);
		  //I declared the spaces as leftCenter and righCenter
		  int lineLength = line.length();
		  int leftCenter = inputLength - 1;
	      int rightCenter = lineLength - inputLength;
	      //Declaring space as a string
		    for (int lineNumber = 2; lineNumber <= inputLength ; lineNumber++) {
		       String newLine = "";
		       //Finding to print space or character
		      int variation = lineNumber - 2;
		      for (int i = 0; i < lineLength; i++) {
		        if ( i == leftCenter + variation || i == leftCenter - variation ||
		        		i == rightCenter + variation ||i == rightCenter - variation){
		        	newLine += " ";
		        }
		        else {
		        	newLine += line.charAt(i);
		        }
		      }
		      System.out.println(newLine);
		      line = newLine;
		    }
		  
		  
	}
}