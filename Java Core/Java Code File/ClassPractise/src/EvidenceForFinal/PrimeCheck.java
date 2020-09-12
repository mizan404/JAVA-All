package EvidenceForFinal;

import java.util.Scanner;

public class PrimeCheck {

    public static void main(String args[]) {
        isPrime();
    }

    public static void isPrime() {
        int num, b, c;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter A Number ");

        num = input.nextInt();
        b = 1;
        c = 0;

        while (b <= num) {
            if ((num % b) == 0) {
                c = c + 1;
            }
            b++;
        }
        if (c == 2) {
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is not a prime number");
        }
    }
}
