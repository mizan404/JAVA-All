package Chapter_22;

import java.util.Scanner;

public class CheckPrimeNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number: ");
        int num = sc.nextInt();
        isPrime(num);
        //getPrimeNumbers(num);
    }

    /* public static void getPrimeNumbers(int num) {
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
    }*/ 

    public static boolean isPrime(int num) {
        int i;
        for (i = 2; i < num; i++) {
            if (num % i == 0) {
                break;
            }
        }

        if (i == num) {
            System.out.println("Is prime");
            //return true;
        } else {
            System.out.println("Is not prime");
            //return false;
        }
        return true; 
    }

}
