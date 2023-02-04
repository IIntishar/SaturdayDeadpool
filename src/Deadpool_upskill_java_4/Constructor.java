package Deadpool_upskill_java_4;

public class Constructor {
	
	/*Constructor is instance of class, method same as class name, java will execute constructor first
	- 	Constructor cannot be static or override nor void or return type.
	- 	Default Constructor : No constructor is initialized
	- 	Parameterized Constructor : Add different signature
	-	Constructor overloading : Different signature
	*/
	
	String studentName;
	int studentAge;
	public Constructor(String name, int age) {
		studentName = name;
		studentAge = age;
		
	}
	
	public Constructor(String name) {
		studentName = name;
		
	}
	
	public Constructor( int age) {
		studentAge = age;
	}
		
	public static void main(String[] args) {
		Constructor obj = new Constructor("Arafat", 27);
		System.out.println(obj.studentName);
		System.out.println(obj.studentAge);
		
		Constructor obj2 = new Constructor("Tanzu");
		System.out.println(obj2.studentAge);
		Constructor obj3 = new Constructor(27);
		System.out.println(obj3.studentAge);
	}

}
