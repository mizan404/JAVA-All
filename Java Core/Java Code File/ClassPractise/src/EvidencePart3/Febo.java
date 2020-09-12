package EvidencePart3;

public class Febo {

    public static void main(String[] args) {
        int a, b, c;
        System.out.print("The Fibonacci Series is: ");
        for (a = 0, b = 1, c = 0; c <= 1000; a = b, b = c, c = a + b) {
            System.out.print(c + " ");

        }
    }
}
