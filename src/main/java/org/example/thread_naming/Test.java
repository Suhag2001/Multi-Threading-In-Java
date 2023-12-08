package org.example.thread_naming;

class  MyTread extends  Thread{
    @Override
    public void run() {
          Thread.currentThread().setName("myTread ");
        System.out.println("thread executed : " + Thread.currentThread().getName());
    }
}

public class Test {
    public static void main(String[] args) {
        System.out.println(" thread is running");
        System.out.println( Thread.currentThread().getName());
        Thread.currentThread().setName("suhag");
        System.out.println(Thread.currentThread().getName());
//        System.out.println(100/0);
        MyTread t1 = new MyTread();
//        t1.setName("hii bro");
        System.out.println(t1.getName());
        t1.start();
        System.out.println(t1.isAlive());
        MyTread t2 = new MyTread();
        t2.start();
        System.out.println(t2.getName());
        System.out.println(Thread.currentThread().isAlive());
    }
}
