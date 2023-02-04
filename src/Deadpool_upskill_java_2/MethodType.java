package Deadpool_upskill_java_2;

public class MethodType {
	/*Types of Methods 
	 1. Void Methods : should not have a return value.
	 2. Static Method : cannot be overridden.
	 3. Return Type Method: Every method in Java is declared with a return type and it is mandatory for all java methods
	 */
		public static int hourlyIncome = 65;
		public static void main(String[]arg ) {
			MethodType obj = new MethodType();
			obj.annualIncome();
			weeklyIncome();
			System.out.println("My Monthly Income=" +obj.monthlyIncome());
			System.out.println("substraction");
			
		
			//void method
		}
		protected void annualIncome() {
			int calculateAnnualIncome = hourlyIncome * 2000;
			System.out.println("My Annual Salary =" +calculateAnnualIncome );
			
			//static method 
		}
		protected static void weeklyIncome() {
			int calculateWeeklyIncome = hourlyIncome * 40;
			System.out.println("Weekly Income =" +calculateWeeklyIncome );
		}
			//Return Type method 
		public int monthlyIncome() {
			int calculateMonthlyIncome = hourlyIncome * 180;
			return calculateMonthlyIncome;
		}
		public static int intishar() {						//method Variable 
			String name = "Intishar Arafat";
					int age = 27;
					System.out.println(name);
					return age;
					
					
		}
		public int substraction() {
			  int a = 10;
			  int b = 4;
			  int substraction = (a - b);
			  return substraction;
			 
			  
		
		 // Write down a static String return Type method ?
					
						
					
		// Write down a static Int Return type method?
				
						  
						}
	
			
					
		}
		

