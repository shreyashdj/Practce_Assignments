package com.bridgelabz.PracticeAssignment;

import java.util.Scanner;

public class EvenAndOdd {

	public static void main(String[] args) {

		/*
		 *   printing even & odd numbers
		 *   printing sum of odd & even numbers
		 */
		
		int even = 0;
		int odd = 0;
		int evenSum = 0;
		int oddSum = 0;
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter first number : ");
		int first = scan.nextInt();
		
		System.out.print("Enter last number : ");
		int last = scan.nextInt();
		
		System.out.println("\n\tEven	Odd");
		for (int i = first; i <= last; i++) {
			if (i % 2 == 0) {
				even = i;
				evenSum += even;
				System.out.print("\t" + even);
			} else {
				odd = i;
				oddSum += odd;
				System.out.println("\t" +odd);
			}
			
		}
		System.out.println("\n\n  Sum : " +evenSum +"\t" +oddSum);
		
scan.close();
	}
}