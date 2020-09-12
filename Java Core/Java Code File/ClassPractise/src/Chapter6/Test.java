package Chapter6;

public class Test {

    public static void main(String[] args) {
        int k = 2;
        //nPrint("A message", k);
        System.out.println(k);
        System.out.println((int) (Math.random() * (65535 + 1)));
        System.out.println((int) ('a' + Math.random() * ('z' - 'a' + 1)));
        System.out.println((char) ('a' + Math.random() * ('z' - 'a' + 1)));
        System.out.println((int) (Math.random()+.5));
    }

}
