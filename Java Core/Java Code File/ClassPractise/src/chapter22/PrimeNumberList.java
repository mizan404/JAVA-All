package chapter22;

import java.util.Scanner;

public class PrimeNumberList {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbewr ");
        int num = input.nextInt();

        getPrimeNumbers(num);
    }

    public static void getPrimeNumbers(int num) {
        int i = 2;
        int count = 0;
        while (i <= num) {
            if (isPrime(i)) {
                System.out.print(i + " ");
                count++;
                if (count % 10 == 0) {
                    System.out.println();
                }

            }
            i++;

        }

    }

    public static boolean isPrime(int num) {
        int i;
        for (i = 2; i < num; i++) {
            if (num % i == 0) {
                break;
            }

        }
        if (i == num) {
            return true;

        } else {
            return false;

        }
    }

    // return true;
}
