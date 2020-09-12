package evidence;

import java.util.Scanner;

public class PrimeNumber2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("number");
        int num = sc.nextInt();
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
            System.out.println(num + " prime");
        } else {
            System.out.println(num + " not prime");

        }
        return true;
    }

}
