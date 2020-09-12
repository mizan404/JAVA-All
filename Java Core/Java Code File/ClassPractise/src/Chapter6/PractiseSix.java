package Chapter6;

public class PractiseSix {

    int x = 10;
    int y = 20;

    public static void main(String[] args) {
        PractiseSix m = new PractiseSix();
        int one = m.makeSum(m.x, m.y);
        System.out.println("One: " + one);
    }

    public int makeSum(int x, int y) {
        int sum = x - y;
        return sum;
    }
}
