package co.grandcircus;

import java.util.Scanner;

public class Lab4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String cont = "yes";

		while (cont.equalsIgnoreCase("yes")) {

			System.out.println("Enter an integer");
			int num1 = scan.nextInt();

			System.out.println("Number      Squared          Cubed");
			System.out.println("=======================================");
		for (int i = 1; i <= num1; i++) {
			System.out.println(i+"      " +"        "+ numSquare(i) +"               "+ numCubed(i));

		}

			System.out.println("Do you want to continue?  (Yes/No");
			cont = scan.next();
		}

//	this is where your program will end	
		System.out.println("Thanks for playing!");
		scan.close();

	}

	

	private static int numSquare(int square) {
		int rec = square * square;
		return rec;
	}

	private static int numCubed(int cube) {
		int cub = cube * cube * cube;
		return cub;
	}

}
