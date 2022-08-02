package com.bridgelabz.PracticeAssignment;

import java.util.Scanner;

public class TableOfNumber {

	public static void main(String[] args) {

		/*
		 *		taking number from user & printing its table & sum
		 */
		
		Scanner scan = new Scanner(System.in);

		System.out.print("Please Enter the Number : ");
		int num = scan.nextInt();
		
		System.out.println("\n Table of " +num);
		for (int i = 1; i <= 10; i++) {
			int table = num * i;
			System.out.println(table);
		}
		int sum = 55 * num;
		System.out.println("Sum is : " + sum);
		
scan.close();		
	}
}