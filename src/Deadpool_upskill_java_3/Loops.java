package Deadpool_upskill_java_3;

public class Loops {

						/* Types of Loops
						1. For Loop
						2. While Loop
						3. Do while loop
						4. Infinite Loop
*/
		public static void main(String[] args) {
				//practiceforloop();
				//practiceWhileLoop();
				//practiceDoWhileLoop();
				//PracticeInfiniteLoop();
				practiceNestedForLoop();


}
		public static void practiceforloop() {						//For Loop - Do again and again upto upper Limit
			int i;													//Initialize the variable
			for(i =1; i<=1000; i++) {								// Setting lower limit, upper limit, Increment or Decrement
				System.out.println("For loops Number = " + i);		//Statement
	
	
	
}
}
		public static void practiceWhileLoop() {					// While Loop - Do again and again upto condition match
			int i = 1;												// Initialize the variable 
			while(i<=1000){											// Setting Condition
				System.out.println("while Loop Number = " + i);		//Statement 
				i++;												//Increment do decrement 
}
}

		public static void practiceDoWhileLoop() {					// Do while Loop - DO action then match condition 
			int i = 1;												// Initialize The variable
			{
				System.out.println("do While Loops Number" + i);	// Statement 
				i++;												// Increment Or Decrement
} 				while(i<=100);										// Checking Condition



}
			public static void PracticeInfiniteLoop() {					// Infinite Loop - Never ending Loop
				int i;													// Initialize the Variable
				for (i=1; ;i++) {										// Setting No Upper Limit
					System.out.println("Infinite Hello = " + i );		// Statement  
	
}
}

			public static void practiceNestedForLoop() {				//if a loop exists inside the body of another loop
				int i;													// Initialize I for loop 1
				int j;													// Initialize j for loop 2
				for (i=1; i<=100; i++){									// First Loop for i 
					for (j=1; j<=100; j++) {								// 2nd loop for j 
						int multipicationTable = i * j;
						System.out.print(multipicationTable + " ");
	}
					System.out.println("");	
	
	}
}

}

