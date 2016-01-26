/**
 * File Name: EmployeeHourLog.java<br>
 * Shiflett, Chance<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Jan 25, 2016
 */
package com.sqa.cs.basic;

import java.util.Scanner;

/**
 * @author Shiflett, Chance
 * @version 1.0.0
 * @since 1.0
 */
public class EmployeeHourLog {

	public static double averageHours(int totalHours, int totalDays) {
		double average;
		average = (double) totalHours / (double) totalDays;
		return average;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String userName, daysWorked, dayHourString;
		int numOfDays, totalHours = 0;
		double averageDaily;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Hello and welcome to the Weekly Hour Tracker\nWhat's your name: ");
		userName = keyboard.nextLine();
		System.out.print("How many days did you attend work this week " + userName + "? ");
		daysWorked = keyboard.nextLine();
		numOfDays = Integer.parseInt(daysWorked);
		if (numOfDays == 0 || numOfDays > 7) {
			System.out.println("You can only work 7 days in a week. Farewell");
			keyboard.close();
			System.exit(0);
		}
		int[] dayHours = new int[numOfDays];
		for (int i = 0; i < numOfDays; i++) {
			System.out.print("How many hours did your work on day " + (i + 1) + ":");
			dayHourString = keyboard.nextLine();
			dayHours[i] = Integer.parseInt(dayHourString);
			totalHours = totalHours + dayHours[i];
		}
		averageDaily = averageHours(totalHours, numOfDays);
		System.out.println(userName + ", you worked a total of " + totalHours + " hours");
		System.out.println("You worked an average of " + averageDaily + " hours a day");
	}
}
