package threadtest;

public class TestCallRun extends Thread {

    public void run() {
        for (int i = 1; i < 5; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(i+" "+ Thread.currentThread().getName());
        }
    }

    public static void main(String args[]) {
        TestCallRun t1 = new TestCallRun();
        TestCallRun t2 = new TestCallRun();
        t1.setName("T1");
        t2.setName("T2");
        t1.start();
        t2.start();
    }
}
