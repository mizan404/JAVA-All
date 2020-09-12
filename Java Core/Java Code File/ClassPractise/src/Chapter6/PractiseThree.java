package Chapter6;

public class PractiseThree {

    public static void main(String[] args) {
        one();
        PractiseThree m = new PractiseThree();
        m.one();
        PractiseThree.one();

    }

    public static void one() {
        System.out.println("Try it");
    }
}
