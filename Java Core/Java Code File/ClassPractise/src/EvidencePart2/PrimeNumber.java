package EvidencePart2;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = input.nextInt();
        isPrime(num);
    }

    public static boolean isPrime(int num) {
        int i;
        for (i = 2; i < num; i++) {
            if (num % i == 0) {
                break;

            }

        }
        if (i == num) {
            System.out.println(num + " Is prime number ");

        } else {
            System.out.println(num + " Is not prime number ");

        }
        return true;
    }
}
