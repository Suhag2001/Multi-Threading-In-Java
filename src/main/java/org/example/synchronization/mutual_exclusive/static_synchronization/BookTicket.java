package org.example.synchronization.mutual_exclusive.static_synchronization;

class BookTicket {
   static int totalSeats = 20;
    synchronized static public void book(int n){

        if(n<= totalSeats){
            System.out.println(n +" Seat Book Successfully !");
            totalSeats = totalSeats-n ;
            System.out.println("Seat Lefts : " + totalSeats);
        }else{
            System.out.println(n + " sorry seats can't be booked'");
            System.out.println("Seat Lefts : " + totalSeats );
        }

    }
}
