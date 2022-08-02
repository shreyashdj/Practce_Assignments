package com.bridgelabz.PracticeAssignment;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {

		/*
		 *		printing reverse of number & sum of its digits
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		int num = scan.nextInt();
		
		int sum = 0;
		System.out.print("Reverse number : ");
		while (num > 0) {
			int reverse = num % 10;
			System.out.print(reverse);
			num = num / 10;
			sum += reverse;
		}
		System.out.println("\nSum of digit of number = " +sum);
		
scan.close();
	}
}