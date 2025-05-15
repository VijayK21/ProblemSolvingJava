package Math;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		System.out.println("Enter number to be reversed");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		reverseNum(num);

	}

	private static void reverseNum(int num) {
		String rNum = "";
		while (num % 10 > 0) {
			int last_digit = num % 10;
			rNum += last_digit;
			num = num / 10;
		}
		System.out.println(rNum);
	}

}
