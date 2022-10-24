package com.bridgelabz;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
	 
		int number,remainder =0, revNumber = 0;
		System.out.println("Enter the any number");
		Scanner scan = new Scanner(System.in);
		number = scan.nextInt();
		while(number > 0) {
			remainder = number % 10;
			//System.out.print(remainder);
			revNumber = (revNumber* 10)+remainder;
			number = number / 10;
		}
		System.out.println("reverse number is :"+revNumber);
		scan.close();

	}

}
