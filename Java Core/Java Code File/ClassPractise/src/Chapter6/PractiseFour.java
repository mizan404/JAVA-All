package Chapter6;

public class PractiseFour {

    int x = 10;
    static int y = 200;

    public static void main(String[] args) {
        PractiseFour m = new PractiseFour();
        m.x = 20;

        y = 500;
        
        System.out.println("X: " + m.x + " Y: " + y);

    }
}
