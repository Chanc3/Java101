/**
 * File Name: GradeEvaluation.java<br>
 * Shiflett, Chance<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Jan 23, 2016
 */
package com.sqa.cs.basic;

import java.util.Scanner;

public class GradeEvaluation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String gradeValueString;
		double gradeValueNum, gradeValueTotal = 0;
		int numOfEntries = 0, gradeAverage;
		Scanner keyboard = new Scanner(System.in);
		do {
			System.out.print("\nEnter grade value (Type \"exit\" to stop): ");
			gradeValueString = keyboard.nextLine();
			if (!gradeValueString.equals("exit")) {
				numOfEntries = numOfEntries + 1;
				gradeValueNum = Double.parseDouble(gradeValueString);
				gradeValueTotal = gradeValueNum + gradeValueTotal;
				gradeAverage = (int) (gradeValueTotal / numOfEntries);
				System.out.println("Your current average is: " + gradeAverage + "%");
			}
		} while (!gradeValueString.equals("exit"));
		keyboard.close();
		System.exit(0);
	}
}
