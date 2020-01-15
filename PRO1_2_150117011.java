import java.util.Scanner;

public class PRO1_2_150117011 {
	//Buse Batman - 150117011
    //I made this program to find the Tls and Krs in the user's amount of the money
	public static void main(String[] args) {
		// Creating a scanner
		Scanner input = new Scanner(System.in);

		// Giving message to user to enter the amount of the money
		System.out.print("Enter the amount of the money:");

		// Declaring money as double first
		double money = input.nextDouble();
		// Then declaring the money as an integer
		int moneyTls = (int) (money);

		/*
		 * If we substract the moneyTls from money , we can find the Krs as a
		 * double.To make it integer, we have to multiply it with a hundread.
		 */
		int moneyKrs = (int) ((money - moneyTls) * 100);

		// Finding the 200TLs in the amount of the money
		int twoHundredTls = moneyTls / 200;
		// With the help of the remainder we find the remaining amount of the
		// money
		moneyTls = moneyTls % 200;
		// Finding the 100Tls
		int oneHundredTls = moneyTls / 100;
		moneyTls = moneyTls % 100;
		// Finding the 50Tls
		int fiftyTls = moneyTls / 50;
		moneyTls = moneyTls % 50;
		// Finding the 20Tls
		int twentyTls = moneyTls / 20;
		moneyTls = moneyTls % 20;
		// Finding the 10Tls
		int tenTls = moneyTls / 10;
		moneyTls = moneyTls % 10;
        //Finding the 5Tls
		int fiveTls = moneyTls / 5;
		moneyTls = moneyTls % 5;
		//Finding the 1Tls(Remaining money gives us the result)
		int oneTls = moneyTls;
		
        //Finding the 50Krs 
		int fiftyKrs = moneyKrs / 50;
		moneyKrs %= 50;
		//Finding the 25Krs
		int twentyFiveKrs = moneyKrs / 25;
		moneyKrs %= 25;
		//Finding the 10Krs
		int tenKrs = moneyKrs / 10;
		moneyKrs %= 10;
		//Finding the 5 Krs
		int fiveKrs = moneyKrs / 5;
		moneyKrs %= 5;
		//Finding the 1Krs(Remaining money is the result)
		int oneKrs = moneyKrs;
		
        //Printing the results
		System.out.println("Your money " + money + " consists of");
		System.out.println("\t" + twoHundredTls + " 200TLs");
		System.out.println("\t" + oneHundredTls + " 100TLs");
		System.out.println("\t" + fiftyTls + " 50TLs");
		System.out.println("\t" + twentyTls + " 20TLs");
		System.out.println("\t" + tenTls + " 10TLs");
		System.out.println("\t" + fiveTls + " 5TLs");
		System.out.println("\t" + oneTls + " 1TLs");
		System.out.println("\t" + fiftyKrs + " 50Krs");
		System.out.println("\t" + twentyFiveKrs + " 25Krs");
		System.out.println("\t" + tenKrs + " 10Krs");
		System.out.println("\t" + fiveKrs + " 5Krs");
		System.out.println("\t" + oneKrs + " 1Krs");

	}

}
