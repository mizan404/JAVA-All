package Evidence;

import java.util.Scanner;

public class PassFail {

    public static void main(String[] args) {
        PassFail();

    }

    public static void PassFail() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Written Exam Result: ");
        int i = s.nextInt();

        System.out.println("Enter Evidence Exam Result: ");
        int j = s.nextInt();
        if ((i * (100 / 100) >=   60) && (j > 30)) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");

        }

    }
}
