package org.example.synchronization.coordination;


class TotalEarning extends Thread{
    int amount = 0 ;
    @Override
    public void run() {
        synchronized (this) {
            for (int i = 0; i <=  5; i++){
                amount = amount + 100;
            }
            this.notify();
        }

    }
}

public class MovieBookApp {
    public static  void main(String[] args) throws InterruptedException {
        TotalEarning t = new TotalEarning();
        t.start();
//        System.out.println("Total Earning : " +t.amount + " Rs");


        synchronized(t) {
            try{
                t.wait();
            }catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("Total Earning : " +t.amount + " Rs");
        }
    }
}
