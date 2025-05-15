package Math;

import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {

		System.out.println("Enter Number to find whether its a prime number");
		Scanner sc = new Scanner(System.in);
		int userInput = sc.nextInt();
		isPrime(userInput);
	}

	private static void isPrime(int userInput) {

		if (userInput <= 1) {
			System.out.println("It is not prime: " + userInput);
			return;
		}

		else {

			for (int i = 2; i <= Math.sqrt(userInput); i++) {

				if (userInput % i == 0) {
					System.out.println("Its not a prime: " + userInput);
					return;
				}
			}
			System.out.println("Its a prime: " + userInput);
		}
	}
}