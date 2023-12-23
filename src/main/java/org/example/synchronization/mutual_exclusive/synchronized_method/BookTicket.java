package org.example.synchronization.mutual_exclusive.synchronized_method;

class BookTicket {
    int totalSeats = 10 ;
    synchronized public  void book(int n){

        System.out.println("hi " + Thread.currentThread().getName());
        System.out.println("hi " + Thread.currentThread().getName());
        System.out.println("hi " + Thread.currentThread().getName());
        if(n<= totalSeats){
            System.out.println(n +" Seat Book Successfully !");
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
