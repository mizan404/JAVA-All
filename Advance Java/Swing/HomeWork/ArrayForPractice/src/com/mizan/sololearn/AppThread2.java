package com.mizan.sololearn;

class Printer {

//    synchronized void printDocument(int numOfCopies, String docName) {
    void printDocument(int numOfCopies, String docName) {
        for (int i = 1; i <= numOfCopies; i++) {
            try {
                Thread.sleep(5);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            System.out.println("Printed " + docName + " " + i);
        }
    }
}

class MyThread extends Thread {

    Printer pRef;

    MyThread(Printer p) {
        pRef = p;
    }

    @Override
    public void run() {
        synchronized (pRef) {
            pRef.printDocument(10, "Rahman's Name");
        }
    }
}

class YourThread extends Thread {

    Printer pRef;

    YourThread(Printer p) {
        pRef = p;
    }

    @Override
    public void run() {
        synchronized (pRef) {
            pRef.printDocument(10, "Mohammad's Name");
        }
    }
}

public class AppThread2 {

    public static void main(String[] args) {
        System.out.println("==Application Started==");
        //  We have only 1 Single Printer Object. 
        Printer printer = new Printer();
//  Printer.printDocument(10, "Mizan's Name");
        //  Scenario is that we have multi thread working on the same Printer Object.
        MyThread mt = new MyThread(printer);    // Mythread is having reference to the Printer bject. 
        YourThread yt = new YourThread(printer);// YourThread is having reference to the Printer bject. 
        mt.start();
//        try {
//            mt.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        yt.start();

        System.out.println("==Application Ended==");
    }
}
