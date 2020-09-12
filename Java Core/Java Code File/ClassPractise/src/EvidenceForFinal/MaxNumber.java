package EvidenceForFinal;

import java.util.Scanner;

public class MaxNumber {

    public static void main(String[] args) {
        max();
    }

    public static void max() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Three Number To Find Out Max: ");
        System.out.println("Enter First Number For i: ");
        int i = input.nextInt();
        System.out.println("Enter First Number For j: ");
        int j = input.nextInt();
        System.out.println("Enter First Number For k: ");
        int k = input.nextInt();
        if (i > j && i > k) {
            System.out.println("Number i is max: " + i);
        } else if (j > k && j > i) {
            System.out.println("Number j is max: " + j);
        } else {
            System.out.println("Number k is max: " + k);
        }

    }
}
