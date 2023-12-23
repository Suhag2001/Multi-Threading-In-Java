package org.example.synchronization.asynchronization;


class BookTicket {
    int totalSeats = 10 ;
    public void book(int n){

        System.out.println("hi " + Thread.currentThread().getName());
        System.out.println("hi " + Thread.currentThread().getName());
        System.out.println("hi " + Thread.currentThread().getName());
        if(n<= totalSeats){
            System.out.println("Seat Book Successfully !");
            totalSeats = totalSeats-n ;
            System.out.println("Seat Lefts : " + totalSeats);
        }else{
            System.out.println("sorry seats can't be booked'");
            System.out.println("Seat Lefts : " + totalSeats );
        }
        System.out.println("hi " + Thread.currentThread().getName());
        System.out.println("hi " + Thread.currentThread().getName());
        System.out.println("hi " + Thread.currentThread().getName());
    }
}
public class MovieBookApp extends Thread {
    static BookTicket b ;
    int seats  ;
    @Override
    public void run() {
        b.book(seats);
    }

    public static void main(String[] args) {
        b = new BookTicket();
        MovieBookApp ravi = new MovieBookApp();
        ravi.seats  =7;
        ravi.start();
        MovieBookApp amar  = new MovieBookApp();
        amar.seats = 6 ;
        amar.start();
    }
}
