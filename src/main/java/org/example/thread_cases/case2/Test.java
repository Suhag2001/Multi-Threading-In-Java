package org.example.thread_cases.case2;

// performing single task from multiple thread
class MyThead extends Thread{
    @Override
    public void run() {
        System.out.println("My thread is running");
    }
}
public class Test {
    public static void main(String[] args) {
        MyThead  thread =  new MyThead();
        thread.start();
        System.out.println(thread.getName());
        MyThead thread2 = new MyThead();
        thread2.start();
        System.out.println(thread2.getName());
        MyThead thread3 = new MyThead();
        thread3.start();
        System.out.println(thread3.getName());
    }
}