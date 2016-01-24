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

	public static String grade(int gradeAv) {
		String letterGrade = "ERROR";
		if (gradeAv > 89) {
			letterGrade = "A";
		} else if (gradeAv > 79) {
			letterGrade = "B";
		} else if (gradeAv > 69) {
			letterGrade = "C";
		} else if (gradeAv > 59) {
			letterGrade = "D";
		} else if (gradeAv < 60) {
			letterGrade = "F";
		}
		return letterGrade;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String gradeValueString, letter = "ERROR";
		double gradeValueNum, gradeValueTotal = 0;
		int numOfEntries = 0, gradeAverage = 0;
		Scanner keyboard = new Scanner(System.in);
		do {
			System.out.print("\nEnter grade value (Type \"exit\" to stop): ");
			gradeValueString = keyboard.nextLine();
			if (!gradeValueString.equals("exit")) {
				numOfEntries = numOfEntries + 1;
				gradeValueNum = Double.parseDouble(gradeValueString);
				gradeValueTotal = gradeValueNum + gradeValueTotal;
				gradeAverage = (int) (gradeValueTotal / numOfEntries);
				letter = grade(gradeAverage);
			}
			System.out.println("Your current average is: " + letter + " " + gradeAverage + "%");
		} while (!gradeValueString.equals("exit"));
	}
}
