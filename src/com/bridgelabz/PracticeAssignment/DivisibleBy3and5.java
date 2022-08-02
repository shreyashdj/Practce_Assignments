package com.bridgelabz.PracticeAssignment;

import java.util.Scanner;

public class DivisibleBy3and5 {

	public static void main(String[] args) {

		/*
		 *	printing numbers which are divisible by both 3 & 5
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter first number : ");
		int first = scan.nextInt();
		
		System.out.print("Enter last number : ");
		int last = scan.nextInt();
		
		System.out.println("\n Numbers divisible by 3 & 5 :");
		for (int i = first; i <= last; i++) {
			if (i % 3 == 0 && i % 5 == 0) {		// we can use only (i % 15 == 0)
				System.out.println(i);
			}
		}
		
scan.close();
	}
}