package com.bridgelabz.PracticeAssignment;

import java.util.Scanner;
/*
 * @author SHREYASH JADHAV
 */
public class ArrayPrint {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter size of array : ");
		int n = scan.nextInt();		// taking size of array
		
		int [] array = new int [n];		// declaring array of integer
		
		//		storing array elements
		System.out.println("\nEnter elements of array");
		for (int i = 0; i < n; i++) {
		array [i] = scan.nextInt();
		}
		
		//		printing array elements
		System.out.println("\nElements of array are :");
		for (int i = 0; i < n; i++) {
		System.out.print(array [i] +"  ");
		}
			
scan.close();
	}
}