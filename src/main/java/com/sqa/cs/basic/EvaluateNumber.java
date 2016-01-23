package com.sqa.cs.basic;

import java.util.Scanner;

public class EvaluateNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		String numString;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Hello, please enter a number: ");
		numString = keyboard.nextLine();
		num = Integer.parseInt(numString);
		if (num < 10) {
			System.out.println("The number is LESS THAN 10");
		} else if (num > 10) {
			System.out.println("The number is GREATER THAN 10");
		} else if (num == 10) {
			System.out.println("The number is EQUAL TO 10");
		}
		keyboard.close();
		System.exit(0);
	}
}
