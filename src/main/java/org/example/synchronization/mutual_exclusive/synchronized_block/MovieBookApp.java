package org.example.synchronization.mutual_exclusive.synchronized_block;

// here i use synchronized method for synchronization

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
