package Chapter6;

public class Practise {

    int x = 10;
    static int y = 100;

    public static void main(String[] args) {
        Practise m = new Practise();
        m.x = 20;
        y = 1000;
        System.out.println(m.x + y);
    }

}
