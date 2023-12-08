package org.example.join_thread.licence_example;
class  Medical extends  Thread{
    @Override
    public void run() {
        System.out.println("Medical starting...");
        try {
            sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Medical finished");
    }
}
class TestDrive extends Thread {
    @Override
    public void run() {
        System.out.println("Testing drive...");
        try {
            sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Test drive completed ");
    }
}
class  OfficerSign extends Thread {
    @Override
    public void run() {
        System.out.println("Office sign started...  ");
        try {
            sleep(7000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Office sign completed ");
    }
}
public class LicenceDemo {
    public static void main(String[] args) throws InterruptedException {
        Medical medical = new Medical();
        medical.start();
        medical.join();
        TestDrive testDrive = new TestDrive();
        testDrive.start();
        testDrive.join();
        OfficerSign officeSign = new OfficerSign();
        officeSign.start();
    }
}
