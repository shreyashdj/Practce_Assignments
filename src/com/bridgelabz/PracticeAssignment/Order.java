package com.bridgelabz.PracticeAssignment;

import java.util.Scanner;

public class Order {

	public static void main(String[] args) {

		/*
		 *		printing numbers in ascending & descending order
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter first number : ");
		int first = scan.nextInt();
		
		System.out.print("Enter second number : ");
		int last = scan.nextInt();
		int j = last;
		
		System.out.println("\nNumbers between "+first +" & " +last);
		for (int i = first; i <= last; i++) {
			System.out.println(i + "\t" + j);
			j--;
		}
		
scan.close();
	}
}