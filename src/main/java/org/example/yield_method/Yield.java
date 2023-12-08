package org.example.yield_method;


class MyThread extends Thread {
    @Override
    public void run() {
        Thread.yield();
        for (int i = 0; i <=5 ; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + " - " + i);
        }
    }
}
public class Yield {
    public static void main(String[] args) throws InterruptedException {
//        Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
        MyThread myThread = new MyThread();
        myThread.setPriority(Thread.MAX_PRIORITY);
        myThread.start();

//        Thread.yield();  // if we want to give the chance to other threads to execute then we will use yield method , it doesn't matter support window so we cannot get the proper output'
        for (int i = 0; i <=5 ; i++) {
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName() + " - " + i);
        }

    }
}
