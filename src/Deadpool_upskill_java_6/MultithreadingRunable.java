package Deadpool_upskill_java_6;

public class MultithreadingRunable {

	public class MultiThreadingRunable implements Runnable{
		
		public void run(){
			try{
				System.out.println("Thread Number # " + Thread.currentThread().getName() + " is Running");
			} catch (Exception e){
				System.out.println("Exception is caught");
				
}
		}}}