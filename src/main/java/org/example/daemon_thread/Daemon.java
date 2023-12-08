package org.example.daemon_thread;


class  MyThread extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().isDaemon());
        System.out.println("Thread started");
    }
}

public class Daemon {
    public static void main(String[] args) {
        System.out.println("Starting main thread");
//        Thread.currentThread().setDaemon(true);// throw IllegalThreadStateException
        MyThread myThread = new MyThread();
        myThread.setDaemon(true);
        myThread.start();
    }
}
