package com.bridgelabz;

import java.util.Scanner;

public class VowelOrConsonant {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Alphabet");
		char c = scan.next().charAt(0);
		switch(c) {
		case 'a':
		case 'b':
		case 'i':
		case 'o':
		case 'u':
			System.out.println(c+" is Vowel");
			break;
			default:
				System.out.println(c+" ic Consonant");
		}
		scan.close();
	}

}
