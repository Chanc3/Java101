/**
 * File Name: CountingEvensUpTo100.java<br>
 * Shiflett, Chance<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Jan 23, 2016
 */
package com.sqa.cs.basic;

public class CountingEvensUpTo100 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int even;
		for (int i = 0; i <= 100; i++) {
			even = i % 2;
			if (even == 0) {
				System.out.println("Number" + i);
			}
		}
	}
}
