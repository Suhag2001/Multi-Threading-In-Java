package org.example.sleep_method;

class MyThread extends Thread {
    @Override
    public void run() {
        int minute = 0;
        for (long j = 0; j < Integer.MAX_VALUE; j++) {
            for (int i = 1; i <= 59; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    // Restore interrupted status and continue
                    Thread.currentThread().interrupt();
                }
                System.out.print("\r"+ minute + " : " + i);
            }
            minute++;
        }
    }
}

public class Sleep {


    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        myThread.start();

    }
}
