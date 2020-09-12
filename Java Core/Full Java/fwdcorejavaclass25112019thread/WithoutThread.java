package threadnew;


public class WithoutThread {
    void print1(){
        System.out.print("P1: ");
        for (int i = 0; i < 6; i++) {
            System.out.print(i+ " ");            
        }
        System.out.println("");
    }
    
    void print2(){
        System.out.print("P2: ");
        for (int i = 0; i < 6; i++) {
            System.out.print(i+ " ");            
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        WithoutThread obj = new WithoutThread();
        obj.print1();
        obj.print2();
    }
    
}
