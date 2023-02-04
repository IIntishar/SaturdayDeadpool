////. Write a Java program to convert temperature from Fahrenheit to Celsius degree.
package com.upskill.assigment_2;

public class Assigment_10 {
	public static void main(String[] args) {
	    // The temperature in Fahrenheit
	    double fahrenheit = 98.6;
	    
	    // Convert temperature to Celsius degree
	    double celsius = (fahrenheit - 32) / 1.8;
	    
	    // Print the temperature in Celsius
	    System.out.println("The temperature in Celsius is " + celsius + " degrees.");
	
}
}