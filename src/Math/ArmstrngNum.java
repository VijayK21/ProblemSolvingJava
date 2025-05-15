package Math;

import java.util.ArrayList;
import java.util.Scanner;

public class ArmstrngNum {

	public static void main(String[] args) {

		System.out.println("Enter number ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		isPalindrome(number);
	}

	private static void isPalindrome(int number) {
		// 153 = 153
		int original_num = number;
		int len = ("" + original_num).length();
		int sum = 0;
		while (original_num != 0) {
			int last_num = original_num % 10;
			int temp = 1;
			for (int i = 0; i < len; i++) {
				temp *= last_num;
			}
			sum += temp;
			original_num /= 10;

		}
		String res = (sum == number) ? "Its an ArmStrong Number" : "Not an Armstrong Number";
		System.out.println(res);

	}
}