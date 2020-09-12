package version2;

import java.util.Scanner;

public class Prime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Prime");
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
        if (num == i) {
            System.out.println(" Prime");

        } else {
            System.out.println(" Not Prime");

        }
        return true;
    }

}
