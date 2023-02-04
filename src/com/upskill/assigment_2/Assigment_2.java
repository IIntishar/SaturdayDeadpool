package com.upskill.assigment_2;

public class Assigment_2 {


	/*	public static String getGrade(int marks) {
		    if (marks >= 70) {
		        return "Grade A";
		    } else if (marks >= 80) {
		        return "Grade B";
		    } else if (marks >= 70) {
		        return "Grade C";
		    } else if (marks >= 60) {
		        return "Grade D";
		    } else if (marks >= 50) {
		        return "Grade E";
		    } else {
		        return "Grade F"; */
	public static void main(String[] args) {
	    int marks = 86; 

	    if (marks >= 90) {
	        System.out.println("Grade A");
	    } else if (marks >= 80) {
	        System.out.println("Grade B");
	    } else if (marks >= 70) {
	        System.out.println("Grade C");
	    } else if (marks >= 60) {
	        System.out.println("Grade D");
	    } else {
	        System.out.println("FAIL");
	    }
	}

}
