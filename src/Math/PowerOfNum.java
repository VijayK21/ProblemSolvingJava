package Math;

import java.util.Scanner;

public class PowerOfNum {

	public static void main(String[] args) {
		
		System.out.println("Enter number ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("Enter power");
		int power = sc.nextInt();
		getPower(num,power);
	}

	private static void getPower(int num,int pow) {
		int temp= 1;
		for(int i=pow ; i>0 ; i--) {
			temp= temp * num;
		}
		System.out.println("Power of the number is "+temp);
	}
}
