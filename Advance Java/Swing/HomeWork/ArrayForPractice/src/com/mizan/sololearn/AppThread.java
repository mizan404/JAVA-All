package com.mizan.sololearn;

//class MyTask {
//
//    void ExcuteTask() {
//        for (int i = 1; i <= 10; i++) {
//            System.out.println("Printing Document " + i + " Printer 2=====");
//        }
//    }
//}
//MyTask IS-A Thread. 
class CA {

}

class MyTask extends CA implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Printing Document " + i + " Printer 2=====");
        }
    }
}

class YourTask implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("========Printing Document " + i + " Printer 3=====");
        }
    }
}

public class AppThread {

    public static void main(String[] args) {

        //Job 1 
        System.out.println("==Application Started==");
        //Job 2
//        MyTask mt = new MyTask();// Child thread or worker thread. 
//      //mt.ExcuteTask();
//        mt.start();
        Runnable r = new MyTask();
        Thread th = new Thread(r);
        th.setDaemon(true);//.....................
        th.start();
        
        
        
        Thread yourtask = new Thread(new YourTask());
        yourtask.start();

        //Job 3
        for (int i = 1; i <= 10; i++) {
            System.out.println("Printing Document " + i + " Printer 1");
        }

        //Job 4
        System.out.println("==Application Ended==");
    }
}
