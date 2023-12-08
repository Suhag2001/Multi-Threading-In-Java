package org.example.join_thread;

class MyThread2 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <=5 ; i++) {
            try {
                Join.j.join();
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + " - " + i);
        }
    }
}
class MyThread extends Thread{
    @Override
    public void run() {
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
public class Join {

    static Thread j ;

    public static void main(String[] args) throws InterruptedException {
        MyThread t = new MyThread();
        t.start();
         t.join();


        for (int i = 0; i <=5 ; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + " - " + i);
        }
       j = Thread.currentThread();
        MyThread2 t2 = new MyThread2();
        t2.start();

    }
}
