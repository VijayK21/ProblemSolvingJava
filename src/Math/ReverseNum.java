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
		int original_num =num;
		int len = (""+original_num).length();
		while (len>0) {
			int last_digit = original_num % 10;
			rNum += last_digit;
			original_num = original_num / 10;
			len--;
		}
		System.out.println(rNum);
	}

}
