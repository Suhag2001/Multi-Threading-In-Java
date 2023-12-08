package org.example.interrrupt_method;
 class MyThread extends Thread{
     @Override
     public void run() {
         for(int i = 0; i <6 ; i++) {
             System.out.println("Thread " + i );
//             try {
////                 sleep(1000);
//             } catch (InterruptedException e) {
//                 throw new RuntimeException(e);
//             }
//             try {
//                 wait();
//             } catch (InterruptedException e) {
//                 throw new RuntimeException(e);
//             }
         }
     }
 }
public class Interrupt {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        myThread.interrupt();  // its work only when the thread is in sleeping or waiting state

    }
}
