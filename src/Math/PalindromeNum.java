package Math;

import java.util.Scanner;

public class PalindromeNum {

	public static void main(String[] args) {

		System.out.println("Enter number ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		isPalindrm(number);
	}

	private static void isPalindrm(int number) {
		String num = ""+number;
        String[] split_arr = num.split("");
        String reversed_num ="";

        for(int i=split_arr.length;i>0;i--){
            reversed_num+=split_arr[i-1];
        }
        
        if(reversed_num.equalsIgnoreCase(num))
        	System.out.println("Its Palindrome");
        else
        	System.out.println("Its not a Palindrome");
	}
}