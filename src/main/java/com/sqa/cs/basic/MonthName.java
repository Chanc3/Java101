package com.sqa.cs.basic;

import java.util.Scanner;

public class MonthName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int monthNumber;
		String month, monthNumberString;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Give a number 1-12: ");
		monthNumberString = keyboard.nextLine();
		monthNumber = Integer.parseInt(monthNumberString);
		while (0 > monthNumber || monthNumber > 12) {
			System.out.print("The number you provided was not 1-12 \nPlease provide a number that is 1-12: ");
			monthNumber = keyboard.nextInt();
		}
		switch (monthNumber) {
		case 1:
			month = "January";
			break;
		case 2:
			month = "February";
			break;
		case 3:
			month = "March";
			break;
		case 4:
			month = "April";
			break;
		case 5:
			month = "May";
			break;
		case 6:
			month = "June";
			break;
		case 7:
			month = "July";
			break;
		case 8:
			month = "August";
			break;
		case 9:
			month = "September";
			break;
		case 10:
			month = "October";
			break;
		case 11:
			month = "November";
			break;
		case 12:
			month = "December";
			break;
		default:
			month = "Error";
		}
		System.out.println("The month is " + month);
		keyboard.close();
		System.exit(0);
	}
}
