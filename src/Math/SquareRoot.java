package Math;

import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {

		System.out.println("Enter Number to find its square root");
		Scanner sc = new Scanner(System.in);
		int userInput = sc.nextInt();
		getsqrt(userInput);
	}

	private static void getsqrt(int userInput) {
		int nearby = 0;
		boolean perfSqr = false;

		for (int i = 1; i <= userInput; i++) {

			if (i * i == userInput) {
				System.out.println("Square root of " + userInput + " is " + i);
				perfSqr = true;
				break;
			}

			else {
				int rem = userInput - (i * i);

				if (rem > 0) {
					nearby = i;
				} else {
					break;
				}
			}

		}
		if (nearby != 0 & perfSqr != true) {
			System.out.println("Nearby possible square root is " + nearby);
		}
	}

}
