package com.bridgelabz;

import java.util.Scanner;

public class NumbersDisplayInUnit {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Enter the numbrs");
		int number = read.nextInt();
		if(number < 10) {
			System.out.println("Your Numbers Unit is: Ones");
		}
		else if(number < 100) {
			System.out.println("Your Numbers Unit is : Tens");
		}
		else if(number < 1000) {
			System.out.println("your Numbers Unit is : Hundreds");
		}
		else if(number < 10000) {
			System.out.println("Your number Unit is : Thousands");
		}
		else if(number < 100000) {
			System.out.println("Your Number Unit is : Ten Thousands");
		}
		else {
			System.out.println("plz enter the number between ten lack ");
		}
		read.close();
	}

}
