package Deadpool_upskill_java_6;

public class MultiThreading {
    /* Multithreading is a Java feature that allows concurrent execution of two or more parts of a program.
    Threads can be created by using two mechanisms :
    Extending the Thread class
    Implementing the Runnable Interface */

    public static void main(String[] args) {
        int threadCount = 10;
        for (int i = 0; i < threadCount; i++) {

            MultiThreadingThread obj1 = new MultiThreadingThread();
            obj1.start();

            Thread obj2 = new Thread();
            obj2.start();
        }
    }
}

