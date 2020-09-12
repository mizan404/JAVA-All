package threadnew;

public class T1 extends Thread{

     @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
            sleep(2000);
            System.out.println("T1: "+i);            
        }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } 
    }    
}
