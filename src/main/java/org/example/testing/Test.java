package org.example.testing;

public class Test extends Thread{
    @Override
    public void run() {
        System.out.println("Thread class of thread is running");
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.start();

    }
}
