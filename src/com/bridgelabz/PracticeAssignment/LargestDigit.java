package com.bridgelabz.PracticeAssignment;

import java.util.Scanner;
/*
 * @author SHREYASH JADHAV
 */
public class LargestDigit {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		int num = scan.nextInt();
		
		int max = 0;
		while (num > 0) {
			int lastDigit = num % 10;	// separating last digit
			if (lastDigit > max) {		// checking which digit is max till now
			max = lastDigit;
			}
			num = num / 10;
		}
		System.out.println("Largest digit of number is : " +max);
		
scan.close();
	}

}
