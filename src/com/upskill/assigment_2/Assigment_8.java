//Write Java Program to display Factorial of Number 7.
package com.upskill.assigment_2;

public class Assigment_8 {
	public static void main(String[] args) {
	    int number = 7;
	    int factorial = 1;
	    for (int i = 1; i <= number; i++) {
	      factorial *= i;
	    }
	    System.out.println("The factorial of " + number + " is " + factorial + ".");
	}
}