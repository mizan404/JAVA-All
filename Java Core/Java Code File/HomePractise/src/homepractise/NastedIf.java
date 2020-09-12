package homepractise;

import java.util.Scanner;

public class NastedIf {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double score = input.nextDouble();
        if (score >= 90.0) {
            System.out.println("A");
        } else if (score >= 80.0) {
            System.out.println("B");
        } else if (score >= 70.0) {
            System.out.println("C");
        } else if (score >= 60.0) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}
