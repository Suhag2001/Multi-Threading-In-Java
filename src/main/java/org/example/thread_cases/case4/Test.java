package org.example.thread_cases.case4;

// performing multiple task from multiple thread
class MyThread1 extends Thread{
    @Override
    public void run() {
        System.out.println("Thread 1 : " + Thread.currentThread());
    }
}
class MyThread2 extends Thread{
    @Override
    public void run() {
        System.out.println("Thread 2 : " + Thread.currentThread());
    }
}
class MyThread3 extends Thread{
    @Override
    public void run() {
        System.out.println("Thread 3 : " + Thread.currentThread());
    }
}
class MyThread4 extends Thread{
    @Override
    public void run() {
        System.out.println("Thread 4 : " + Thread.currentThread());
    }
}
class MyThread5 extends Thread{
    @Override
    public void run() {
        System.out.println("Thread 5 : " + Thread.currentThread());
    }
}
public class Test {

    public static void main(String[] args) {
        MyThread1 myThread1 = new MyThread1();
        myThread1.setPriority(10);
        MyThread2 myThread2 = new MyThread2();
        myThread2.setPriority(9);
        MyThread3 myThread3 = new MyThread3();
        myThread3.setPriority(2);
        MyThread4 myThread4 = new MyThread4();
        myThread4.setPriority(1);
        MyThread5 myThread5 = new MyThread5();
        myThread5.setPriority(3);

        myThread1.start();
        myThread2.start();
        myThread3.start();
        myThread4.start();
        myThread5.start();
    }
}
