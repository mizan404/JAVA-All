package threadnew;

public class T2 implements Runnable{

    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
            Thread.sleep(1000);
            System.out.println("T2: "+i);            
        }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } 
    }    
}
