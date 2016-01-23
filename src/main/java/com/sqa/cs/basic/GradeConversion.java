package com.sqa.cs.basic;

import java.util.Scanner;

public class GradeConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double gradeValue;
		String gradeValueString, gradeLetter;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is your grade value?");
		gradeValueString = keyboard.nextLine();
		gradeValue = Double.parseDouble(gradeValueString);
		if (gradeValue >= 3.5) {
			System.out.println("You have an \"A\"!");
		} else if (gradeValue < 3.5) {
			System.out.println("You have a \"B\"!");
		} else if (gradeValue < 2.5) {
			System.out.println("You have a \"C\"!");
		} else if (gradeValue < 1.5) {
			System.out.println("You have a \"D\"!");
		} else if (gradeValue < 0.5) {
			System.out.println("You have an \"F\"");
		} else {
			System.out.println("Error");
		}
		keyboard.close();
		System.exit(0);
	}
}
