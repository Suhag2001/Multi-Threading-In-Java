package org.example.thread_cases.case1;

// performing single task from single thread
class MyTread extends Thread{
    @Override
    public void run() {
        System.out.println("My Thread is running");
    }
}
public class Test {
    public static void main(String[] args) {
        MyTread t1 = new MyTread();
        t1.start();
    }
}
