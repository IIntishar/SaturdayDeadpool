package Deadpool_upskill_java_4;

public class Polymorphim {
	/* Polymorphism is the ability of an object to take on many forms.
	 * Depending on suatiouation its changes 
		- Method Overloading (Compile time Polymorphism/Static binding) Same method name with different signature to overload
		- Method Overridding (Runtime Polymorphism/Dynamic binding) Same method name from Parent class to override
		*/

	public static void main(String[] args) {
		//car();
		//car(1000);
		//car("Moon");
		//car(8, "signal");
		
		Polymorphim obj = new Polymorphim();
		obj.annualIncome();
		

	}

	private void annualIncome() {
		
		
	}

	public static void car() {
		System.out.println("My car a Honda Civic");
		
	}
	
	public static void car(int hp) {
		System.out.println("My car is Civic" + "it has hp engine : " + hp);
		
	}
	
	public static void car(String roof) {
		System.out.println("My car is Honda! " + "it has Soul" + roof);
	}
	
	public static void car(int battery, String motor) {
		System.out.println("My car is Tesla! " + "It has Battery : " + battery + "It Has Motor: " + motor );
		
	}
}

