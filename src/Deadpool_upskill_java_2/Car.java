package Deadpool_upskill_java_2;

public class Car {
	String carMake = Car.getMake("123ABC456DEF");

	  public static String getMake(String carVin) {
	    String make = "Toyota";
	    return make;
	  }
	  
	String result1 = Car.myMethod1();
	String result2 = Car.myMethod2();

	  public static String myMethod1() {
	
	    String result = "Hello, world!";
	    return result;
	  }
	  
	  public static String myMethod2() {

	    String result = "Goodbye, world, I'm Going home!";
	    return result;
}}