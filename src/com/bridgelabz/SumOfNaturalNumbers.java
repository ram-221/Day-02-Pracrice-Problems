package com.bridgelabz;

import java.util.Scanner;

public class SumOfNaturalNumbers {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the natural numbers");
		int number = scan.nextInt();
		int sum = 0;
		for(int i=1;i<=number;i++) {
			sum = sum+i;
		}
		System.out.println("You result is :"+sum);
		scan.close();
	}
}