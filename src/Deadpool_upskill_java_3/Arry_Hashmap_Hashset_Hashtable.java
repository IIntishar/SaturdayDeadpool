package Deadpool_upskill_java_3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Arry_Hashmap_Hashset_Hashtable {

	public static void main(String[] args) {
		//Arry store multiple data using index
		int age = 30;
		int[] AgeDeadpool = new int[] {25,21,35,30,40};
		System.out.println("Student age : "+ AgeDeadpool[1]);
		System.out.println("total Student :" +AgeDeadpool.length);
		
		//
		
		
			String [] nameDeadPool = new String []{"shumi", "Arafat", "Intishar"," Tanzu", "shamee"};
		

		System.out.print("Student Name: " + nameDeadPool[4]);
		System.out.println("Total Student Name: " + nameDeadPool.length);
		
		
		// nameCity
		
		String[] city = {"New York", "Los Angeles", "Chicago", "Houston", "Philadelphia"};
		System.out.println("City Name: " + city[3]);
		System.out.println("Total city : " + city.length);
	
	
	//multi dimensional array java
		

		int [][] age2d = {{25,21,35,30,40},
						{21,25,22,46}};
		System.out.println("Student Age 2D: " + age2d[0][4]);
		HashMap<String, Integer> student = new HashMap< String, Integer>();
		student.put("Intishar", 27);
		student.put("Tanzu", 27);
		student.put("Shumee", 24);
		student.put("shami", 26);
		System.out.println("Hashmap Student Age: " + student.get("Tanzu"));
		
		
		//Hashmap for capital
		
		

		        HashMap<String, String> Capital = new HashMap<String, String>();
		        
				Capital.put("Bangladesh", "Dhaka");
				Capital.put("USA", "Washington DC");
				Capital.put("China", "Beijing");
				Capital.put("India", "New Delhi");
				Capital.put("Afghanistan", "Kabul");
				System.out.println("Capital City : " + Capital.get("USA"));
				
				
			HashSet<String> Car = new HashSet<String>();
			Car.add("BMW");
			Car.add("Toyata");
			Car.add("Audi");
			Car.add("Ford");
			System.out.println("car :" +Car);
			
			
			Hashtable<String, String> Region = new Hashtable<String, String>();
			Region.put("BD", "Asia");
			Region.put("USA", "America");
			System.out.println("region: " + Region.get("BD"));
		
}

}








