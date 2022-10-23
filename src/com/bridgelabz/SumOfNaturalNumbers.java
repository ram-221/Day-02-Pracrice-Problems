package com.bridgelabz;

import java.util.Scanner;

public class SumOfNaturalNumbers {

	public static void main(String[] args) {

		int number, i = 1;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the natural numbers");
		number = scan.nextInt();
		int sum = 0;
		while(i <= number) {
			sum = sum+i;
			i++;
		}
		System.out.println("You result is :"+sum);
		scan.close();
	}
}