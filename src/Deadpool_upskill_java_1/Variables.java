package Deadpool_upskill_java_1;

public class Variables {

	String country = "USA";								//Instance OR global variable - Variables declared in Class level, outside method
	
	static String name = "Arafat";						//Static variable - variables belong to class and don't required creating object
	
	public static void main (String[] args) {
	String city = "New York";							//Local variable - variables declared in methods
		System.out.println(name);
		Variables obj = new Variables ();
		System.out.println(obj.country);
		method2("Queens");
	}
		public static void method2 (String county){						////Method parameter - variables used as method parameter, pass value
			String city = "Bloomfileld";
			System.out.println(county);
	}
}
