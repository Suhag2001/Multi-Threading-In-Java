package org.example.synchronization.mutual_exclusive.static_synchronization;

// here i use static synchronized method for synchronization
//static provid class level of lock
import org.example.Main;

class MyThread2 extends Thread{
    BookTicket b ;
    int seats ;
    MyThread2(BookTicket b , int seats){
        this.b = b;
        this.seats = seats;
    }
    @Override
    public void run() {
        b.book(seats);
    }
}class MyThread1 extends Thread{
    BookTicket b ;
    int seats ;
    MyThread1(BookTicket b , int seats){
        this.b = b;
        this.seats = seats;
    }
    @Override
    public void run() {
        b.book(seats);
    }
}

public class  MovieBookApp  {

    public static void main(String[] args) {

        BookTicket b = new BookTicket();
        MyThread1 myThread1 = new MyThread1(b , 7);
        myThread1.start();
        MyThread2 myThread2 = new  MyThread2(b, 8);
        myThread2.start();
        BookTicket b2 = new BookTicket();
        MyThread1 myThread3 = new MyThread1(b2 , 4);
        myThread3.start();
        MyThread2 myThread4 = new  MyThread2(b2, 8);
        myThread4.start();
    }
}
