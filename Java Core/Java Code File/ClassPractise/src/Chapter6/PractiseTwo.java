package Chapter6;

public class PractiseTwo {
static int q =400000;
    public static void main(String[] args) {
        System.out.println(one());
        PractiseTwo m = new PractiseTwo();
        System.out.println(m.two());
        int n = three();
        System.out.println(n);
    }

    public static int one() {
        return 100;
    }

    public static int two() {
        int x = 400;
        return x;
    }

    public static int three() {
        return q;
    }
}
