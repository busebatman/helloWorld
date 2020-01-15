import java.util.Scanner;
public class Pro3_1_150117011 {
	
	public static void main(String[] args) {
		/* Buse Batman
		*  150117011
		   I made this program to compute the number of bits in the binary representation of N. */ 
		Scanner input = new Scanner(System.in);
		//Prompt the user to enter an integer
		System.out.print("Enter an integer number: ");
		int N = input.nextInt();
		//First we declare the number of bits as 0 
		int numOfBits=0;
		//Then we increment the value of number of bits
		while (N!=0){
		for(numOfBits=0 ; N>0 ; numOfBits++)
			N/=2;
			//If the user enter a negative integer ,program prints illegal input message to screen 
			System.out.println((N < 0)? "The number of bits: Illegal input"+"\n" : "The number of bits: " + numOfBits+"\n");
			//Program continiues until the user enters 0
			System.out.print("Enter an integer number: ");
		    N = input.nextInt();
		}
		   //If the user enter 0 , program ends
			if(N==0){
					System.out.println("Program ends. Bye");
					System.exit(0);
				}
		
		
	}

}
