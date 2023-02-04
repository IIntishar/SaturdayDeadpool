package Deadpool_upskill_java_6;


public class Singleton {

	//Singleton is class that have only one object
	//Private Constructor, it prevents any other class from instantiatings

		private Singleton(){
			
		}
		
		private static Singleton singletonObj = new Singleton();
		
			public static Singleton getIntance() {         // Anyone can access this class using getIntance.
			
				return singletonObj;
				
			}
			
		protected static void demo() {
			System.out.println("Singleton Demo Method");
			
		}
			
			
}
