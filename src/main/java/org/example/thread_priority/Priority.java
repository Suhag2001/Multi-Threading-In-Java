package org.example.thread_priority;

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("MyThread started");

        System.out.println("MyThread priority : " + Thread.currentThread().getPriority() );
    }
}
public class Priority {
    public static void main(String[] args) {
        System.out.println("main thread priority : "+Thread.currentThread().getPriority()); //By default priority is 5
        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
//        Thread.currentThread().setPriority(20);  //IllegalArgumentException( range 1-10)
        System.out.println("main thread priority : "+Thread.currentThread().getPriority());
        MyThread myThread = new MyThread();
        myThread.setPriority(Thread.MIN_PRIORITY);
        myThread.start();


    }
}
