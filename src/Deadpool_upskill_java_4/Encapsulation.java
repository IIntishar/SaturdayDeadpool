package Deadpool_upskill_java_4;

public class Encapsulation {

	
	//Encapsulation used to hide the data using setter and getter method
		private String name = "upskill";			//write & read
		private int ssn = 45213678;				//write only
		private String username = "INTISH";		//read only
		private String city;
		
		public static void main(String[] args) {
			Encapsulation obj = new Encapsulation();
			obj.setName("INT");
			System.out.println(obj.getName());
			obj.setSSN(56845214);
			System.out.println(obj.getUsername());
			obj.setcity("Newyork");
			System.out.println(obj.getcity());
		}
		
		private void setcity(String value) {
			city = value;
		}
		public String getcity(){
			return city;
		}

		//Setter Method - name						//set the data, Write
		public void setName(String value){
			name = value;
		}
		
		//Getter Method - name						//get the data, Read
		public String getName(){
			return name;
		}
		
		//Setter Method - ssn						//set the data, Write only
		public void setSSN(int value){
			ssn = value;
		}
		
		//Getter Method - username		 			//get the data, Read only
		public String getUsername(){
			return username;
		}
		
		
	
	        
			
		}
		
		
		
	
