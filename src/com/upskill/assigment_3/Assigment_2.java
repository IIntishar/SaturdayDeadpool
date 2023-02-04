package com.upskill.assigment_3;

public class Assigment_2 {
	public void main(String[] args) {
	}
	
  static public class Employee {
    String name;
    int age;
    double salary;
    String address;

    public Employee(String name, int age, double salary, String address) {
      this.name = name;
      this.age = age;
      this.salary = salary;
      this.address = address;
    }

    public void displayEmployeeInfo() {
      System.out.println("Name: " + name);
      System.out.println("Age: " + age);
      System.out.println("Salary: " + salary);
      System.out.println("Address: " + address);
    }
  }

  static public class Main {
    public static void main(String[] args) {
      Assigment_2.Employee employee1 = new Assigment_2.Employee("John Smith", 30, 45000, "123 Main Street");
      Assigment_2.Employee employee2 = new Assigment_2.Employee("Jane Doe", 25, 50000, "456 Market Street");
      Assigment_2.Employee employee3 = new Assigment_2.Employee("Bob Johnson", 35, 55000, "789 Park Avenue");
      Assigment_2.Employee employee4 = new Assigment_2.Employee("Samantha Williams", 28, 60000, "321 Maple Street");
      Assigment_2.Employee employee5 = new Assigment_2.Employee("Michael Brown", 40, 65000, "159 Oak Street");

      employee1.displayEmployeeInfo();
      employee2.displayEmployeeInfo();
      employee3.displayEmployeeInfo();
      employee4.displayEmployeeInfo();
      employee5.displayEmployeeInfo();
    }
  }
}
