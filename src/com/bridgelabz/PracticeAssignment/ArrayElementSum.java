package com.bridgelabz.PracticeAssignment;

import java.util.Scanner;
/*
 * @author SHREYASH JADHAV
 */
public class ArrayElementSum {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter size of array : ");
		int n = scan.nextInt();		// taking size of array
		
		int [] array = new int [n];		// declaring array of integer
		
		//	storing array elements
		System.out.println("\nEnter elements of array");
		for (int i = 0; i < n; i++) {
		array [i] = scan.nextInt();
		}
		
		//	calculating sum of array elements
		int sum = 0;
		for (int i = 0; i < n; i++) {
		sum += array [i];
		}
		System.out.println("Sum of elements of array = " +sum);
			
scan.close();
	}

}
