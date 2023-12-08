package org.example.testing;

public class Test2 implements Runnable{
    @Override
    public void run() {
        System.out.println("Runnable thread is running");
    }
    public static void main(String[] args) {
        Test2 test2 = new Test2();
        Thread t = new Thread(test2);
        t.start();

    }
}
