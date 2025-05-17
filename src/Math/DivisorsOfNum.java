package Math;

import java.util.ArrayList;
import java.util.Scanner;

public class DivisorsOfNum {

	public static void main(String[] args) {

		System.out.println("Enter number ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		divisorsOfNum(number);
	}

	private static void divisorsOfNum(int number) {

		ArrayList<Integer> Divisors = new ArrayList<Integer>();

		for (int i = 1; i <= number / 2; i++) {
			if (number % i == 0) {
				Divisors.add(i);
			}
		}

		for (int num : Divisors) {
			System.out.println(Divisors.get(Divisors.indexOf(num)));
		}
	}
}