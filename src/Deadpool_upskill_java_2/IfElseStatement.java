package Deadpool_upskill_java_2;

public class IfElseStatement {
		//Conditional Statement 
	/* public static void main(String[] args) {
			
			int age =10000;
			if(age <=13) {
		//allows you to create a chain of if statements.
				
				System.out.println("you are a children");
			}else if( age > 13 && age <18) {
				
				System.out.println("you are a teenager");
			} else if( age >= 60) {
				if(age < 100) {
					System.out.println("you are senior");
				} else
				System.out.println("you are vampire/Legend");
			} else {
				System.out.println("you are adult");
			}
			}

	}  */

		  
		  public static void main(String[] args) {
		    assignGrades(85);
		  }
		  
		  public static void assignGrades(int percentage) {
		    if (percentage > 90) {
		      System.out.println("Grade: A");
		    } else if (percentage > 75) {
		      System.out.println("Grade: B");
		    } else if (percentage > 65) {
		      System.out.println("Grade: C");
		    } else {
		      System.out.println("Grade: D");
		    }
		  }
		  
	}



