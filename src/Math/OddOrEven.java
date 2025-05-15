package Math;

import java.util.Scanner;

public class OddOrEven {

	public static void main(String[] args) {

		System.out.println("Enter number ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		isOddOrEven(number);
	}

	private static void isOddOrEven(int number) {
	
        if(number==0)
        	System.out.println("Invalid Input");
        else if(number%2==0)
        	System.out.println("Its Even");
        else
        	System.out.println("Its Odd");
	}
}