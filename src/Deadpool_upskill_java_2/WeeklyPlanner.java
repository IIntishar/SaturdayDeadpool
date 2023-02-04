package Deadpool_upskill_java_2;
import java.util.Scanner;

public class WeeklyPlanner {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
		System.out.println("Enter a day of the week (Monday, Tuesday, etc.): ");
		String day = scanner.nextLine();
		switch (day) {
		  case "Monday":
		    System.out.println("Today is Monday. Time to start the work week!");
		    break;
		  case "Tuesday":
		    System.out.println("Today is Tuesday. Keep up the good work!");
		    break;
		  case "Wednesday":
		    System.out.println("Today is Wednesday. Halfway through the week!");
		    break;
		  case "Thursday":
		    System.out.println("Today is Thursday. Only one more day until the weekend!");
		    break;
		  case "Friday":
		    System.out.println("Today is Friday. Time to relax and enjoy the weekend!");
		    break;
		  case "Saturday":
		    System.out.println("Today is Saturday. Time to sleep in and enjoy the day!");
		    break;
		  case "Sunday":
		    System.out.println("Today is Sunday. Time to relax and prepare for the week ahead!");
		    break;
		  default:
		    System.out.println("Invalid day of the week entered. Please try again.");
		}
	}
  }
}
