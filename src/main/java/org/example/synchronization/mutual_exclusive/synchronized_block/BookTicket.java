package org.example.synchronization.mutual_exclusive.synchronized_block;

class BookTicket {
    int totalSeats = 10 ;
     public void book(int n){

        System.out.println("hi " + Thread.currentThread().getName());
        System.out.println("hi " + Thread.currentThread().getName());
        System.out.println("hi " + Thread.currentThread().getName());
        synchronized (this) {
            if(n<= totalSeats){
                System.out.println(n +" Seat Book Successfully !");
                totalSeats = totalSeats-n ;
                System.out.println("Seat Lefts : " + totalSeats);
            }else{
                System.out.println("sorry seats can't be booked'");
                System.out.println("Seat Lefts : " + totalSeats );
            }
        }
        System.out.println("hi " + Thread.currentThread().getName());
        System.out.println("hi " + Thread.currentThread().getName());
        System.out.println("hi " + Thread.currentThread().getName());

    }
}
