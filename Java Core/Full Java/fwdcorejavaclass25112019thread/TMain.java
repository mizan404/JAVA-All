package threadnew;

public class TMain {
    public static void main(String[] args) {
        T1 t1 = new T1();
        Thread t2 = new Thread(new T2());
        t1.start();
        t2.start();
    }
}
