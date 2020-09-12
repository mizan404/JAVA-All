package EvidencePart3;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number for factorial: ");
        int num = input.nextInt();
        BigInteger fact = BigInteger.ONE;
        for (int i = 1; i <= num; i++) {
   fact = fact.multiply(BigInteger.valueOf(i));

        }
        System.out.println("The Factorial is : " + fact);
    }
}
