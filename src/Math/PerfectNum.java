package Math;

import java.util.Scanner;

public class PerfectNum {

	public static void main(String[] args) {

		System.out.println("Enter number ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		isPerfect(num);
	}

	private static void isPerfect(int num) {
		int sum = 0;
		for (int i = 1; i <=num / 2; i++) {
			if (num % i == 0) {
				sum += i;
			}
		}
		System.out.println(sum == num ? "perfect" : "Not perfect");
	}
}