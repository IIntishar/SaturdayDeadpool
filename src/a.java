abstract class Person {
   abstract void greet();
}

class Student extends Person {
   @Override
   void greet() {
      System.out.println("Hi.");
   }
}
