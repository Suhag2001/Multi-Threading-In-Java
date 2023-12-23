package org.example.interrupted__isinterrupted_methods;


class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("interrupted() : "+Thread.interrupted());  //(true) true ---> false
        System.out.println("interrupted() : "+Thread.interrupted());  //(false) false ---> false
//        System.out.println("isInterrupted() : "+Thread.currentThread().isInterrupted()); //(true--->true) it does not change the interrupt value
        for (int i = 0; i < 6 ; i++) {
            System.out.println(i);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class Test {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        myThread.interrupt();
    }
}
