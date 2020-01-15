import java.util.Scanner;
public class Pro3_2_150117011 {

	public static void main(String[] args) {
		/* Buse Batman
		 *  150117011
		   I made this program to calculate the x-th number in the sequence. 
		   The program asks the user for the value of x and prints it out to the screen.*/ 
		Scanner input = new Scanner(System.in);
		//Prompt the user to enter an integer
		System.out.println("Please enter an integer number: ");
		int x = input.nextInt();
		//First declaring first and second number
		int a = 0;
		int b = 1;
		//Then declaring the third number (it will change depending on input)
		int c=0;
		//The value of first and second position is out of loop
		if(x==1)
			System.out.println("In position 1, the value is 0.");
		else if(x==2)
			System.out.println("In position 2, the value is 1.");
		else{
			//Finding the value of the position
		for(int i=2 ; i < x ; i++){
		    c = 4*b-a;
			a=b;
		    b=c;
		}
		System.out.println("In position " + x + ", the value is " + c + ".");
		}

	}

}
